package com.xio.attendance.controller;

import com.xio.attendance.dto.RequestMap;
import com.xio.attendance.dto.ResponseMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    //有关所有审批处理操作
    @RequestMapping(value = "auditProcessorData",method = RequestMethod.GET)
    public Object auditProcessorData(RequestMap requestMap){
        ResponseMap responseMap=new ResponseMap();
        try {

            String statId = requestMap.getStringValue("statId","站长id",true);
            String empId = requestMap.getStringValue("empId","保养员id",true);
            String toAudit = requestMap.getStringValue("toAuditStatus","待审核",false);
            String auditStatus = requestMap.getStringValue("auditStatus","审核状态",false);
            String appealStatus = requestMap.getStringValue("Status","申诉状态",false);
            String lastInstanceStatus = requestMap.getStringValue("lastInstanceStatus","终审状态",false);
            String passStatus = requestMap.getStringValue("passStatus","通过",false);
            String noPassStatus = requestMap.getStringValue("noPassStatus","不通过",false);



        }catch (Exception ex){
            logger.error(ex);
            responseMap.returnError(ex);
        }
        return  null;
    }

}
