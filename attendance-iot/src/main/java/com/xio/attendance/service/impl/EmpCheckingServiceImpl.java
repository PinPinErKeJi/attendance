package com.xio.attendance.service.impl;

import com.xio.attendance.dao.EmpCheckingMapper;
import com.xio.attendance.entity.BaseEmployee;
import com.xio.attendance.entity.SysEmpPosition;
import com.xio.attendance.service.EmpCheckingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author WangGuipin
 * @ClassName EmpCheckingServiceImpl
 * @Description TODO
 * @create 2019-03-20 14:13
 * @desc WangGuipin
 **/
@Service
public class EmpCheckingServiceImpl implements EmpCheckingService {
    @Autowired
    private EmpCheckingMapper empCheckingMapper;
    //查询所有员工id及站点id
    @Override
    public List<BaseEmployee> selectEmpStation() {
        return empCheckingMapper.selectEmpStation();
    }
    //得到下班打卡时间
    @Override
    public List<SysEmpPosition> selectClosingTime() {
        return empCheckingMapper.selectClosingTime();
    }
    //得到上班打卡时间office
    @Override
    public List<SysEmpPosition> selectOfficeTime() {
        return empCheckingMapper.selectOfficeTime();
    }


}
