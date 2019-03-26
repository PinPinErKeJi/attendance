package com.xio.attendance.exception;

/**
 * @Auther: li.yunqi
 * @Date: 2019/1/21 14:08
 * @Description: 业务异常类
 */
public class BizException extends RuntimeException {

    private String status = "9999";


    public BizException(String msg){
        super(msg);
    }
    public BizException(String status, String msg){
        super(msg);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
