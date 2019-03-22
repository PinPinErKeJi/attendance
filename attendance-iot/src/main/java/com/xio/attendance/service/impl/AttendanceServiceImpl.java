package com.xio.attendance.service.impl;

import com.github.pagehelper.PageHelper;
import com.xio.attendance.dao.SysEmpPositionInfoMapper;
import com.xio.attendance.entity.PageBean;
import com.xio.attendance.entity.SysEmpPositionInfo;
import com.xio.attendance.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author WangGuipin
 * @ClassName AttendanceServiceImpl
 * @Description TODO
 * @create 2019-03-18 21:20
 * @desc WangGuipin
 **/
@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Autowired
    private SysEmpPositionInfoMapper sysEmpPositionInfoMapper;

    public List<SysEmpPositionInfo> selectAttendance(String statid,int currentPage,int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<SysEmpPositionInfo> AllEmp = sysEmpPositionInfoMapper.selectAttendance(statid);
        //总条数
        int countNums = sysEmpPositionInfoMapper.countEmp();
        PageBean<SysEmpPositionInfo>   pageData = new PageBean<>(currentPage,pageSize,countNums);
        pageData.setItems(AllEmp);
        return pageData.getItems();
    }
        //异常记录
    @Override
    public Boolean recordAttendance(String id) {
        return sysEmpPositionInfoMapper.recordAttendance(id);
    }
        //异常不记录
    @Override
    public Boolean noRemarkAttendance(String id, String remark) {
        return sysEmpPositionInfoMapper.noRemarkAttendance(id,remark);
    }
        //异常考勤数据统计
    @Override
    public int insert(String uuid, String bempid, String bstatid,Date time,String mDownStatus, String COA, String NR, String uuidUtilUUID, String utilUUID,String longitude,String latitude) {
        return sysEmpPositionInfoMapper.insert( uuid,  bempid,  bstatid,time,mDownStatus,  COA,  NR,  uuidUtilUUID,  utilUUID,longitude,latitude);
    }


}
