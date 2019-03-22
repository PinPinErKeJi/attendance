package com.xio.attendance.dto;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xio.attendance.exception.BizException;
import com.xio.attendance.utils.StringUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RequestMap {
    public static final boolean REQUIRED = true;
    public static final boolean NOTREQUIRED = false;
    private HttpServletRequest request;

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    private Log logger = LogFactory.getLog(RequestMap.class);

    public RequestMap(HttpServletRequest request) {
        this.request = request;
    }

    public String getStringValue(String key, String name, boolean isMust) throws BizException {
        String value = this.request.getParameter(key);
        if (!StringUtil.isEmptyOrNull(value)) {
            value = value.trim();
        } else {
            if (isMust) {
                String msg = name + "";
                throw new BizException(msg);
            }

            if (value != null) {
                value = "";
            }
        }

        return value;
    }

    public String getStringValue(String key, String name, boolean isMust, String defaultValue) throws BizException {
        String value = this.request.getParameter(key);
        if (StringUtil.isEmptyOrNull(value)) {
            if (isMust) {
                String msg = name + "";
                throw new BizException(msg);
            } else {
                return defaultValue;
            }
        } else {
            value = value.trim();
            return value;
        }
    }

    public BigDecimal getBigDecimalValue(String key, String name, boolean isMust) throws BizException {
        String value = this.getStringValue(key, name, isMust);
        BigDecimal decValue = null;

        try {
            if (StringUtil.isEmptyOrNull(value)) {
                return null;
            } else {
                decValue = new BigDecimal(value);
                return decValue;
            }
        } catch (Exception var7) {
            throw new BizException(name);
        }
    }

    public Integer getIntegerValue(String key, String name, boolean isMust) throws BizException {
        String value = this.getStringValue(key, name, isMust);
        Integer intValue = null;

        try {
            if (StringUtil.isEmptyOrNull(value)) {
                return null;
            } else {
                intValue = Integer.valueOf(value);
                return intValue;
            }
        } catch (Exception var7) {
            throw new BizException(name);
        }
    }

    public Long getLongValue(String key, String name, boolean isMust) throws BizException {
        String value = this.getStringValue(key, name, isMust);
        Long lngValue = null;

        try {
            if (StringUtil.isEmptyOrNull(value)) {
                return null;
            } else {
                lngValue = Long.valueOf(value);
                return lngValue;
            }
        } catch (Exception var7) {
            throw new BizException(name);
        }
    }

    public Long getLongValue(String key, String name, boolean isMust, Long defalutValue) throws BizException {
        String value = this.getStringValue(key, name, isMust);
        Long lngValue = null;

        try {
            if (StringUtil.isEmptyOrNull(value)) {
                return defalutValue;
            } else {
                lngValue = Long.valueOf(value);
                return lngValue;
            }
        } catch (Exception var8) {
            throw new BizException(name);
        }
    }

    public Double getDoubleValue(String key, String name, boolean isMust) throws BizException {
        String value = this.getStringValue(key, name, isMust);
        Double douValue = null;

        try {
            if (StringUtil.isEmptyOrNull(value)) {
                return null;
            } else {
                douValue = Double.valueOf(value);
                return douValue;
            }
        } catch (Exception var7) {
            throw new BizException(name);
        }
    }

    public <T> T getObjectVo(String key, String name, boolean isMust, Class<T> clazz) throws BizException {
        String value = this.request.getParameter(key);
        if (isMust && StringUtil.isEmptyOrNull(value)) {
            String msg = name + "";
            throw new BizException(msg);
        } else {
            T t = JSONObject.parseObject(value, clazz);
            if (isMust && t == null) {
                String msg = name + "";
                throw new BizException(msg);
            } else {
                return t;
            }
        }
    }

    public <T> List<T> getObjectListVo(String key, String name, boolean isMust, Class<T> clazz) throws BizException {
        String value = this.request.getParameter(key);
        if (isMust && StringUtil.isEmptyOrNull(value)) {
            String msg = name + "";
            throw new BizException(msg);
        } else {
            List<T> list = JSONArray.parseArray(value, clazz);
            if (!isMust || list != null && ((List)list).size() != 0) {
                if (list == null) {
                    list = new ArrayList();
                }

                return (List)list;
            } else {
                String msg = name + "";
                throw new BizException(msg);
            }
        }
    }

    public void setSessionAttribute(String name, Object obj) {
        this.request.getSession().setAttribute(name, obj);
    }

    public Object getSessionAttribute(String name) {
        return this.request.getSession().getAttribute(name);
    }

    public HttpSession getSession() {
        return this.request.getSession();
    }

    public String getURL() {
        return this.request.getRequestURI();
    }

    public String getUserIP() {
        String ip = this.request.getHeader("X-Forwarded-For");
        if (this.logger.isInfoEnabled()) {
            this.logger.info("getIpAddress(HttpServletRequest) - X-Forwarded-For - String ip=" + ip);
        }

        if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
            if (ip.length() > 15) {
                String[] ips = ip.split(",");

                for(int index = 0; index < ips.length; ++index) {
                    String strIp = ips[index];
                    if (!"unknown".equalsIgnoreCase(strIp)) {
                        ip = strIp;
                        break;
                    }
                }
            }
        } else {
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = this.request.getHeader("Proxy-Client-IP");
                if (this.logger.isInfoEnabled()) {
                    this.logger.info("getIpAddress(HttpServletRequest) - Proxy-Client-IP - String ip=" + ip);
                }
            }

            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = this.request.getHeader("WL-Proxy-Client-IP");
                if (this.logger.isInfoEnabled()) {
                    this.logger.info("getIpAddress(HttpServletRequest) - WL-Proxy-Client-IP - String ip=" + ip);
                }
            }

            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = this.request.getHeader("HTTP_CLIENT_IP");
                if (this.logger.isInfoEnabled()) {
                    this.logger.info("getIpAddress(HttpServletRequest) - HTTP_CLIENT_IP - String ip=" + ip);
                }
            }

            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = this.request.getHeader("HTTP_X_FORWARDED_FOR");
                if (this.logger.isInfoEnabled()) {
                    this.logger.info("getIpAddress(HttpServletRequest) - HTTP_X_FORWARDED_FOR - String ip=" + ip);
                }
            }

            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = this.request.getRemoteAddr();
                if (this.logger.isInfoEnabled()) {
                    this.logger.info("getIpAddress(HttpServletRequest) - getRemoteAddr - String ip=" + ip);
                }
            }
        }

        return ip;
    }
}
