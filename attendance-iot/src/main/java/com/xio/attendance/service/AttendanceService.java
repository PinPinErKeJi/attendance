package com.xio.attendance.service;

import com.xio.attendance.entity.MtEmpPositionInfo;

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
    List<MtEmpPositionInfo> selectAttendance(String statid, int currentPage, int pageSize);
    //异常信息记录
    Boolean recordAttendance(String id);
    //打卡异常不记录
    Boolean noRemarkAttendance(String id,String remark);

    //考勤异常记录
    int  insert(String uuid, String bempid, String bstatid,Date time,String mDownStatus, String COA, String NR, String uuidUtilUUID, String utilUUID,String longitude,String latitude);

    //获取异常审核相关数据
    List<MtEmpPositionInfo> selectAudit(String statId,String empId,String toAudit,String auditStatus, String appealStatus,String lastInstanceStatus,String passStatus,String noPassStatus,int currentPage,int pageSize);

    //员工申诉
    int insertAppeal(String emp_id,String fist_content);

    //员二次工申诉
    int insertSecondAppeal(String emp_id,String second_content);
}
