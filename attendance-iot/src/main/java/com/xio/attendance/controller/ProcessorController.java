package com.xio.attendance.controller;

import com.xio.attendance.dto.RequestMap;
import com.xio.attendance.dto.ResponseMap;
import com.xio.attendance.entity.MtEmpPositionInfo;
import com.xio.attendance.service.AttendanceService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WangGuipin
 * @ClassName ProcessorController
 * @Description TODO
 * @create 2019-03-25 20:59
 * @desc WangGuipin
 **/
@RestController
@RequestMapping("api/ProcessorController/data")
public class ProcessorController {
    private Log logger = LogFactory.getLog(ProcessorController.class);

    @Autowired
    private AttendanceService attendanceService;
    //有关所有审批处理操作
    @RequestMapping(value = "auditProcessorData",method = RequestMethod.GET)
    public Object auditProcessorData(RequestMap requestMap){
        ResponseMap responseMap=new ResponseMap();
        try {

            int currentPage=requestMap.getIntegerValue("currentPage","当前页数",false);
            int pageSize=requestMap.getIntegerValue("pageSize","总条数",false);


            String statid = requestMap.getStringValue("statid","服务站id",false);
            String empid = requestMap.getStringValue("empid","维保工id",false);
            String toAudit = requestMap.getStringValue("toAudit","待审核",false);
            String auditStatus = requestMap.getStringValue("auditStatus","审核",false);
            String appealStatus = requestMap.getStringValue("appealStatus","申诉",false);
            String lastInstanceStatus = requestMap.getStringValue("lastInstanceStatus","终审",false);
            String passStatu = requestMap.getStringValue("passStatu","不通过",false);
            String noPassStatus = requestMap.getStringValue("noPassStatus","通过",false);

            String audit_status_0 = toAudit=="1" ? "0":null;
            String audit_status_1 = auditStatus=="1" ? "1":null;
            String audit_status_2 = appealStatus=="1" ? "2":null;
            String audit_status_3 = lastInstanceStatus=="1" ? "3":null;
            String audit_status_4 = passStatu=="1" ? "4":null;
            String audit_status_5 = noPassStatus=="1" ? "5":null;
            List<MtEmpPositionInfo>  Auditlsit = attendanceService.selectAudit(statid,empid,audit_status_0,audit_status_1,audit_status_2,audit_status_3,audit_status_4,audit_status_5,currentPage,pageSize);

            ;responseMap.put("Auditlsit","Auditlsit");

        }catch (Exception ex){
            logger.error(ex);
            responseMap.returnError(ex);
        }
        return  responseMap;
    }
    //员工初次申诉接口
    public Object empAppeal(RequestMap requestMap){
        ResponseMap responseMap=new ResponseMap();
        try {
            String emp_id = requestMap.getStringValue("emp_id","员工id",true);
            String fist_content = requestMap.getStringValue("fist_content","初次申诉内容",false);
            int listAppeal = attendanceService.insertAppeal(emp_id,fist_content);
            responseMap.put("listAppeal",listAppeal);
        }catch (Exception ex){
            logger.error(ex);
            responseMap.returnError(ex);
        }

        return responseMap;
    }
    //员工二次申诉接口
    public Object empSecondAppeal(RequestMap requestMap){

        ResponseMap responseMap = new ResponseMap();
        try {
            String emp_id = requestMap.getStringValue("emp_id","员工id",true);
            String second_content = requestMap.getStringValue("second_content","初次申诉内容",false);

        }catch (Exception ex){
            logger.error(ex);
        }

        return null;
    }

}
