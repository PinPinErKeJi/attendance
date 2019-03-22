package com.xio.attendance.dao;

import java.util.Date;
import java.util.List;

import com.xio.attendance.entity.SysEmpPositionInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysEmpPositionInfoMapper {
     //查询所有考勤数据
     List<SysEmpPositionInfo> selectAttendance(@Param("prjId") String statid);
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
}