package com.xio.attendance.controller;

import com.xio.attendance.dto.RequestMap;
import com.xio.attendance.dto.ResponseMap;
import com.xio.attendance.entity.MtEmpPositionInfo;
import com.xio.attendance.service.AttendanceService;
import com.xio.attendance.service.MtAppealService;
import com.xio.attendance.utils.UUIDUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private MtAppealService mtAppealService;

    UUIDUtil uuidUtil = new UUIDUtil();
    //查询所有考勤数据
    @RequestMapping( value = "allSheet",method= RequestMethod.GET)
    public Object allSheet(RequestMap requestMap){
        ResponseMap responseMap=new ResponseMap();
        try {
            String statid=requestMap.getStringValue("statid","服务站id必填",true);
            int currentPage=requestMap.getIntegerValue("currentPage","当前页数",false);
            int pageSize=requestMap.getIntegerValue("pageSize","总条数",false);
            System.out.println(statid+currentPage+pageSize);

            List<MtEmpPositionInfo> list = attendanceService.selectAttendance(statid,currentPage,pageSize);
            System.out.println(list);
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

    //员工申诉
    @RequestMapping(value = "empAppeal",method= RequestMethod.POST)
    public Object empAppeal(RequestMap requestMap){

        ResponseMap responseMap=new ResponseMap();
        try {
            String mAuuid = uuidUtil.getUUID();
            String position_info_id = requestMap.getStringValue("position_info_id","考勤异常主id",true);
            String content = requestMap.getStringValue("content","申诉内容",true);
            int sequence = 0;
            sequence = sequence + 1;

            int AppealTrueAndFalse = mtAppealService.addAppeal(mAuuid,position_info_id,sequence,content);
            responseMap.put("AppealTrueAndFalse",AppealTrueAndFalse);

        }catch (Exception ex){
            logger.error(ex);
            responseMap.returnError(ex);
        }
        return  responseMap;
    }


}
