package com.xio.attendance.utils;

import java.util.UUID;

/**
 * @author WangGuipin
 * @ClassName UUIDUtil
 * @Description TODO
 * @create 2019-03-20 13:21
 * @desc WangGuipin
 **/
public class UUIDUtil {
    public  String getUUID(){
        String s = UUID.randomUUID().toString();//用来生成数据库的主键id非常不错。。
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
    }
}
