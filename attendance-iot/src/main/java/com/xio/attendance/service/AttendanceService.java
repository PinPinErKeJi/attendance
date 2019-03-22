package com.xio.attendance.service;

import com.xio.attendance.entity.SysEmpPositionInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author WangGuipin
 * @ClassName AttendanceService
 * @Description TODO
 * @create 2019-03-18 21:19
 * @desc WangGuipin
 **/
public interface AttendanceService {
    List<SysEmpPositionInfo> selectAttendance(String statid, int currentPage,int pageSize);
    //异常信息记录
    Boolean recordAttendance(String id);
    //打卡异常不记录
    Boolean noRemarkAttendance(String id,String remark);

    //考勤异常记录
    int  insert(String uuid, String bempid, String bstatid,Date time,String mDownStatus, String COA, String NR, String uuidUtilUUID, String utilUUID,String longitude,String latitude);
}
