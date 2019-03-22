package com.xio.attendance.service;

import com.xio.attendance.entity.BaseEmployee;
import com.xio.attendance.entity.SysEmpPosition;

import java.util.Date;
import java.util.List;

/**
 * @author WangGuipin
 * @ClassName EmpCheckingService
 * @Description TODO
 * @create 2019-03-20 14:13
 * @desc WangGuipin
 **/
public interface EmpCheckingService {
    //查询所有员工id及服务站id
    List<BaseEmployee> selectEmpStation();
    //得到下班打卡时间
    List<SysEmpPosition> selectClosingTime();
    //得到上班打卡时间office
    List<SysEmpPosition> selectOfficeTime();

}
