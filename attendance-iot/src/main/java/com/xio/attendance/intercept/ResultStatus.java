package com.xio.attendance.intercept;

/**
 * @author WangGuipin
 * @ClassName ResultStatus
 * @Description 错误码
 * @create 2019-03-21 23:39
 * @desc WangGuipin
 **/
public enum ResultStatus {


    // -1为通用失败（根据ApiResult.java中的构造方法注释而来）
    FAIL(-1, "common fail"),
    // 0为成功
    SUCCESS(0, "success"),

    error_pic_file(3,"非法图片文件"),
    error_pic_upload(4,"图片上传失败"),
    error_record_not_found(5, "没有找到对应的数据"),
    error_max_page_size(6, "请求记录数超出每次请求最大允许值"),
    error_create_failed(7,"新增失败"),
    error_update_failed(8,"修改失败"),
    error_delete_failed(9,"删除失败"),
    error_search_failed(10,"查询失败"),
    error_count_failed(11,"查询数据总数失败"),
    error_string_to_obj(12,"字符串转java对象失败"),
    error_invalid_argument(13,"参数不合法"),
    error_update_not_allowed(14,"更新失败：%s"),
    error_duplicated_data(15,"数据已存在"),
    error_unknown_database_operation(16,"未知数据库操作失败，请联系管理员解决"),
    error_column_unique(17,"字段s%违反唯一约束性条件"),
    error_file_download(18,"文件下载失败"),
    error_file_upload(19,"文件上传失败"),

    //100-511为http 状态码
    // --- 4xx Client Error ---
    http_status_bad_request(400, "Bad Request"),
    http_status_unauthorized(401, "Unauthorized"),
    http_status_payment_required(402, "Payment Required"),
    http_status_forbidden(403, "Forbidden"),
    http_status_not_found(404, "Not Found"),
    http_status_method_not_allowed(405, "Method Not Allowed"),

    // --- 5xx Server Error ---
    http_status_internal_server_error(500, "系统错误"),
    //1000以内是系统错误，
    no_login(1000,"没有登录"),
    config_error(1001,"参数配置表错误"),
    user_exist(1002,"用户名已存在"),
    userpwd_not_exist(1003,"用户名不存在或者密码错误"),;

    private int code;
    private String msg;

    ResultStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static int getCode(String define) {
        try {
            return ResultStatus.valueOf(define).code;
        }catch (IllegalArgumentException  e){
            return FAIL.getErrorCode();
        }
    }

    public String getMsg(String define) {
        try {
            return ResultStatus.valueOf(define).msg;
        }catch (IllegalArgumentException e){
            return FAIL.getErrorMsg();
        }
    }
    public static String getMsg(int code){
        for(ResultStatus err : ResultStatus.values()){
            if(err.code==code){
                return err.msg;
            }
        }
        return "errorCode not defined ";
    }
    public int getErrorCode(){
        return code;
    }

    public String getErrorMsg(){
        return msg;
    }

   }
