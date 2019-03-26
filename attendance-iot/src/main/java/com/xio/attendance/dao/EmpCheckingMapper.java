package com.xio.attendance.dao;

import com.xio.attendance.entity.BaseEmployee;
import com.xio.attendance.entity.SysEmpPosition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author WangGuipin
 * @ClassName EmpCheckingMapper
 * @Description TODO
 * @create 2019-03-20 14:12
 * @desc WangGuipin
 **/
@Mapper
public interface EmpCheckingMapper {
    //查询所有id及服务站id
    List<BaseEmployee> selectEmpStation();
    //得到下班打卡时间
    List<SysEmpPosition> selectClosingTime();
    //得到上班打卡时间office
    List<SysEmpPosition> selectOfficeTime();

}
