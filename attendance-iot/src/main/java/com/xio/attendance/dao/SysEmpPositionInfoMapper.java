package com.xio.attendance.dao;

import java.util.Date;
import java.util.List;

import com.xio.attendance.entity.MtEmpPositionInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysEmpPositionInfoMapper {
     //查询所有考勤数据
     List<MtEmpPositionInfo> selectAttendance(@Param("prjId") String statid);
     //查询总条数
     int countEmp();
     //打卡异常记录
     Boolean recordAttendance(@Param("id") String id);
     //打卡异常不记录
     Boolean noRemarkAttendance(@Param("id") String id,@Param("remark") String remark);

     //考勤异常记录
     int insert(@Param("id") String uuid, @Param("empId") String bempid,
                @Param("statId") String bstatid, @Param("recordTimestamp")Date time,@Param("depictType") String mDownStatus,
                @Param("attendanceType") String COA, @Param("handleType") String NR,
                @Param("createId") String uuidUtilUUID, @Param("updateId") String utilUUID,
                @Param("longitude") String longitude,@Param("latitude") String latitude);
     //获取异常审核相关数据
     List<MtEmpPositionInfo> selectAudit(String id, @Param("statId") String statId, @Param("empId") String empId, @Param("toAudit") String toAudit, @Param("auditStatus") String auditStatus, @Param("appealStatus") String appealStatus, @Param("lastInstanceStatus") String lastInstanceStatus, @Param("passStatus") String passStatus, @Param("noPassStatus") String noPassStatus);
     //员工申诉
     int insertAppeal(@Param("empId") String emp_id,@Param("fistContent") String fist_content);

     //员二次工申诉
     int insertSecondAppeal(@Param("emp_id") String emp_id,@Param("second_content") String second_content);
}