package com.xio.attendance.service.impl;

import com.xio.attendance.dao.MtAppealMapper;
import com.xio.attendance.service.MtAppealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WangGuipin
 * @ClassName MtAppealServiceImpl
 * @Description TODO
 * @create 2019-03-25 13:45
 * @desc WangGuipin
 **/
@Service
public class MtAppealServiceImpl implements MtAppealService {
    @Autowired
    private MtAppealMapper mtAppealMapper;
    @Override
    public int addAppeal(String mAuuid,String position_info_id,int sequence ,String content) {
        return mtAppealMapper.addAppeal(mAuuid,position_info_id,sequence,content);
    }
}
