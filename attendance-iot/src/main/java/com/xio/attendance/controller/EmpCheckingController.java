package com.xio.attendance.controller;


import com.xio.attendance.entity.BaseEmployee;
import com.xio.attendance.entity.SysEmpPosition;
import com.xio.attendance.service.AttendanceService;
import com.xio.attendance.service.EmpCheckingService;
import com.xio.attendance.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author WangGuipin
 * @ClassName EmpCheckingController
 * @Description TODO
 * @create 2019-03-20 14:38
 * @desc WangGuiPin
 **/

@RestController
@RequestMapping("api/empChecking/data")
public class EmpCheckingController {
    @Autowired
    private EmpCheckingService empCheckingService;
    @Autowired
    private AttendanceService attendanceService;

    @RequestMapping(value = "EmpStationId",method= RequestMethod.GET)
    public Object EmpStationId() throws ParseException {
        UUIDUtil uuidUtil = new UUIDUtil();
        String morning = "8:00:00:00";
        String noon = "11:40:00:00";
        String startAfternoon = "14:00:00:00";
        String afternoon = "18:00:00:00";

        //状态码
        String mLateStatus = "0"; //上午迟到
        String mDownStatus = "1"; //上午早退
        String AfLateStatus = "2"; //下午迟到
        String AfDownStatus = "3"; //下午早退
        String NotClockIn ="4"; //未打卡

        String COA = "1"; //下班打卡异常
        String ACW = "0"; //上班打卡异常
        String NR = "0";  //未记录



        //上午上班参考时间
        SimpleDateFormat morn = new SimpleDateFormat("HH:mm:ss:sss");
        Date morningTime = morn.parse(morning);
        //下午上班参考时间
        SimpleDateFormat san = new SimpleDateFormat("HH:mm:ss:sss");
        Date startAfternoonTime = san.parse(startAfternoon);
        //中下班参考时间
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss:sss");
        Date noonTime = sdf2.parse(noon);
        //下午下班参考时间
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss:sss");
        Date afternoonTime = sdf1.parse(afternoon);
        //统计时间
        Date statisticsTieme = new Date();
        System.out.println("================所有员工id及服务站点id==========================");
        //所有员工id及服务站点id
        List<BaseEmployee> listEmpStatIdData = empCheckingService.selectEmpStation();

        for(Iterator iterators = listEmpStatIdData.iterator();iterators.hasNext();){
            BaseEmployee  baseEmployee = (BaseEmployee) iterators.next();

            String Bempid  ="1"; //baseEmployee.getId();
            String Bstatid = baseEmployee.getMtWorkLine().getStatId();
            System.out.println("我是员工id："+  Bempid);
            System.out.println("我是服务站工id："+  Bstatid);

            System.out.println("================下班打卡时间==========================");
            //下班打卡时间
            List<SysEmpPosition> listClosingTime = empCheckingService.selectClosingTime();
            for(Iterator iteratorc = listClosingTime.iterator();iteratorc.hasNext();){
                SysEmpPosition sysEmpPosition = (SysEmpPosition) iteratorc.next();
                String Sempid =sysEmpPosition.getEmpId();
                Date Time = sysEmpPosition.getRecordTimestamp();

                //坐标
                String longitude = sysEmpPosition.getLongitude();
                String latitude = sysEmpPosition.getLatitude();

                //实时时间
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:sss");
                String sdate = sdf.format(Time);
                Date recordTime = sdf.parse(sdate);


                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
                String executiontime =  dateFormat.format(new Date());
                System.out.println("参考时间"+ executiontime);
                System.out.println("时间:"+recordTime);
                System.out.println("打卡员工id:"+Sempid);

            if(Bempid.equals(Sempid) && recordTime.before(noonTime)){
                //说明此员工上午早退
                attendanceService.insert(uuidUtil.getUUID(),Bempid,Bstatid,statisticsTieme,mDownStatus,COA,NR,uuidUtil.getUUID(),uuidUtil.getUUID(),longitude,latitude);
                System.out.println("说明此员工上午早退");

            }else if(Bempid.equals(Sempid) &&  recordTime.after(startAfternoonTime) && recordTime.before(afternoonTime)){
                   //说明此员工下午早退
                System.out.println("说明此员工下午早退");
                attendanceService.insert(uuidUtil.getUUID(),Bempid,Bstatid,statisticsTieme,AfDownStatus,COA,NR,uuidUtil.getUUID(),uuidUtil.getUUID(),longitude,latitude);
            }else{
                attendanceService.insert(uuidUtil.getUUID(),Bempid,Bstatid,statisticsTieme,AfDownStatus,NotClockIn,NR,uuidUtil.getUUID(),uuidUtil.getUUID(),longitude,latitude);
            }
            }
            System.out.println("================上班打卡时间==========================");
            //上班打卡时间
            List<SysEmpPosition> listOfficeTime = empCheckingService.selectOfficeTime();
            for(Iterator iteratoro = listOfficeTime.iterator();iteratoro.hasNext();){
                SysEmpPosition sysEmpPosition = (SysEmpPosition) iteratoro.next();
                String oemdid = "1";//sysEmpPosition.getEmpId();
                Date otime = sysEmpPosition.getRecordTimestamp();
                //坐标
                String longitude = sysEmpPosition.getLongitude();
                String latitude = sysEmpPosition.getLatitude();
                //实时数据
                SimpleDateFormat osdf = new SimpleDateFormat("HH:mm:ss:sss");
                String odate = osdf.format(otime);
                Date recordTime = osdf.parse(odate);
                System.out.println("时间:" + recordTime);
                System.out.println("员工id:" + oemdid);

                if(Bempid.equals(oemdid) && recordTime.after(morningTime)){
                    //此员工上午迟到
                    System.out.println("此员工上午迟到");
                    attendanceService.insert(uuidUtil.getUUID(),Bempid,Bstatid,statisticsTieme,mLateStatus,ACW,NR,uuidUtil.getUUID(),uuidUtil.getUUID(),longitude,latitude);
                }else if(Bempid.equals(oemdid) && recordTime.after(startAfternoonTime)){
                    //此员工下午迟到
                    attendanceService.insert(uuidUtil.getUUID(),Bempid,Bstatid,statisticsTieme,AfLateStatus,ACW,NR,uuidUtil.getUUID(),uuidUtil.getUUID(),longitude,latitude);
                    System.out.println("此员工下午迟到");
                }else{
                    attendanceService.insert(uuidUtil.getUUID(),Bempid,Bstatid,statisticsTieme,AfLateStatus,NotClockIn,NR,uuidUtil.getUUID(),uuidUtil.getUUID(),longitude,latitude);
                }
            }
        }
        return null;
    }
}
