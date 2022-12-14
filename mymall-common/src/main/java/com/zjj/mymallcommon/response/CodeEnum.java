package com.zjj.mymallcommon.response;

/**
 * @author zhangjiajun
 * @date 2022/11/26 19:05
 * @description 状态码
 */
public enum CodeEnum {
    REQUEST_SUCCESS(200,"请求成功"),
    REQUEST_FAIL(201,"请求失败"),
    VALID_PARAMETER_FAIL(202, "请求参数错误,详细信息请看data"),
    CATELOG_HAS_NO_ATTR(250,"该分类没有属性信息"),
    ILLEGAL_DELETE_CATEGORY(251,"该分类还与其他属性或品牌关联，不能删除"),
    SUCCESS_DELETE_CATEGORY(252,"删除分类成功");

    private Integer code;
    private String message;
    CodeEnum(Integer code, String message){
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
