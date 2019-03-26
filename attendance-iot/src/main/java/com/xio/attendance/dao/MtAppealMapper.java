package com.xio.attendance.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MtAppealMapper {
    //员工申诉记录
    int addAppeal(@Param("id")String mAuuid,@Param("positionInfoId") String position_info_id ,@Param("sequence")int sequence,@Param("content")String content);

}