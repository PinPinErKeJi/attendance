package com.xio.attendance.controller;

import com.xio.attendance.dto.RequestMap;
import com.xio.attendance.dto.ResponseMap;
import com.xio.attendance.entity.SysEmpPositionInfo;
import com.xio.attendance.exception.BaseResp;
import com.xio.attendance.intercept.ResultStatus;
import com.xio.attendance.service.AttendanceService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author WangGuipin
 * @ClassName researchController
 * @Description TODO
 * @create 2019-03-18 20:58
 * @desc Wangguipin
 **/

@RestController
@RequestMapping("api/attendance/data")
public class ResearchController {

    private Log logger = LogFactory.getLog(ResearchController.class);

    @Autowired
    private AttendanceService attendanceService;
    //查询所有考勤数据

    @RequestMapping( value = "allSheet",method= RequestMethod.GET)
    @ResponseBody
    public Object allSheet(RequestMap requestMap){
        ResponseMap responseMap=new ResponseMap();
        try {
            String statid=requestMap.getStringValue("statid","服务站id必填",true);
            int currentPage=requestMap.getIntegerValue("currentPage","当前页数",false);
            int pageSize=requestMap.getIntegerValue("pageSize","总条数",false);

            List<SysEmpPositionInfo> list= attendanceService.selectAttendance(statid,currentPage,pageSize);
            responseMap.put("list",list);
        } catch (Exception ex) {
            logger.error(ex);
            responseMap.returnError(ex);
        }
        return responseMap;

    }

    //记录异常功能

    @RequestMapping(value = "record",method= RequestMethod.POST)
    public Object record(RequestMap requestMap){
        ResponseMap responseMap=new ResponseMap();
        try {
            String id = requestMap.getStringValue("id","记录id",true);
            boolean trueAndFalse = attendanceService.recordAttendance(id);
            responseMap.put("trueAndFalse",trueAndFalse);
        }catch (Exception ex){
            logger.error(ex);
            responseMap.returnError(ex);
        }
     return responseMap;
    }
    //不记录异常功能
        @RequestMapping(value = "noRemark",method= RequestMethod.POST)
        public Object noRemark(RequestMap requestMap){
            ResponseMap responseMap=new ResponseMap();
            try {
                String id = requestMap.getStringValue("id","不记录id",true);
                String remark = requestMap.getStringValue("remark","备注内容",true);
                boolean trueAndFalse = attendanceService.noRemarkAttendance(id,remark);
                responseMap.put("trueAndFalse",trueAndFalse);
            }catch (Exception ex){
                logger.error(ex);
                responseMap.returnError(ex);
            }
        return  responseMap;
    }
}
