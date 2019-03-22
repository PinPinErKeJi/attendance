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
/*
@ControllerAdvice(annotations = {RestController.class})
@RestController
@RequestMapping("api/attendance/data")
*/
@Controller
@RequestMapping("/api/attendance/data")
public class ResearchController {

    private Log logger = LogFactory.getLog(ResearchController.class);

    @Autowired
    private AttendanceService attendanceService;
    //查询所有考勤数据
    //@ExceptionHandler(value = Exception.class)

    /*
    @RequestMapping( value = "allSheet",method= RequestMethod.GET)
    public Object allSheet(String statid ,int currentPage, int pageSize){
        System.out.println(statid);
        List<SysEmpPositionInfo> list=attendanceService.selectAttendance(statid,currentPage,pageSize);
        return list;

    }
    */

    @RequestMapping( value = "allSheet",method= RequestMethod.GET)
    @ResponseBody
    public Object allSheet(RequestMap requestMap){

        ResponseMap responseMap=new ResponseMap();

        try {
            String statid=requestMap.getStringValue("statid","服务站id",true);
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
    public boolean record(String id){
        boolean trueAndFalse = attendanceService.recordAttendance(id);
        return  trueAndFalse;
    }

    //不记录异常功能
    @RequestMapping(value = "noRemark",method= RequestMethod.POST)
    public boolean noRemark(String id,String remark){
        boolean trueAndFalse = attendanceService.noRemarkAttendance(id,remark);
        return  trueAndFalse;
    }
}
