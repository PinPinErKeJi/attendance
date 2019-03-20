package com.xio.attendance.controller;

import com.xio.attendance.entity.SysEmpPositionInfo;
import com.xio.attendance.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    private AttendanceService attendanceService;
    //查询所以考勤数据
    @RequestMapping( value = "allSheet",method= RequestMethod.GET)
    public Object allSheet(String statid ){
        int currentPage =2;
        int pageSize = 1;
        List<SysEmpPositionInfo> list=attendanceService.selectAttendance(statid,currentPage,pageSize);
        return list;
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
