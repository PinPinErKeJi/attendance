package com.xio.attendance.dao;

import java.util.List;

import com.xio.attendance.entity.SysEmpPositionInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysEmpPositionInfoMapper {
     //查询所有考勤数据
     List<SysEmpPositionInfo> selectAttendance(@Param("prjId") String prjId);
     //查询总条数
     int countEmp();
     //打卡异常记录
     Boolean recordAttendance(@Param("id") String id);
     //打卡异常不记录
     Boolean noRemarkAttendance(@Param("id") String id,@Param("remark") String remark);
}