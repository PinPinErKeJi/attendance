package com.xio.attendance.dto;

import com.xio.attendance.exception.BizException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;


public class ResponseMap<K extends String,V> extends HashMap {

    private static final String STATUS = "status";
    private static final String STATUS_SUCCESS = "0000";
    private static final String STATUS_ERROR = "9999";
    private static final String MSG = "msg";

    private static Log log = LogFactory.getLog(ResponseMap.class);

    public ResponseMap(){

        super();
        this.put(STATUS,STATUS_SUCCESS);
        this.put(MSG,"");
    }

    public ResponseMap returnError(Exception ex){

        if(ex != null){
            if(ex instanceof BizException){

                this.put(STATUS,((BizException)ex).getStatus());
                this.put(MSG,ex.getMessage());
                log.debug(ex);
            } else{
                this.put(STATUS,STATUS_ERROR);
                this.put(MSG,"系统异常！");
                log.error(ex);
            }
        }

        return this;
    }
    public ResponseMap error(){

        this.put(STATUS,STATUS_ERROR);
        this.put(MSG,"系统异常！");

        return this;
    }
}
