package com.xio.attendance.service;

/**
 * @author WangGuipin
 * @ClassName MtAppealService
 * @Description TODO
 * @create 2019-03-25 13:45
 * @desc WangGuiPin
 **/
public interface MtAppealService {
    //员工申诉记录
    int addAppeal(String mAuuid,String position_info_id,int sequence,String content);
}
