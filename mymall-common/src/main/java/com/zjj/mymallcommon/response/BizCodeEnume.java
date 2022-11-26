package com.zjj.mymallcommon.response;

/**
 * @author zhangjiajun
 * @date 2022/11/26 19:05
 * @description 状态码
 */
public enum BizCodeEnume {
    REQUEST_SUCCESS(200,"请求成功"),
    REQUEST_FAIL(201,"请求失败"),
    VALID_PARAMTER_FAIL(202,"请求参数错误,详细信息请看data"),
    CATELOG_HAS_NO_ATTR(250,"该分类没有属性信息");

    private Integer code;
    private String message;
    BizCodeEnume(Integer code, String message){
        this.code = code;
        this.message = message;
    }
    public Integer getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }
}
