package com.zjj.mymallcommon.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangjiajun
 * @date 2022/11/24 13:12
 * @description
 */
@Data
public class ServerResponse<T> implements Serializable {
    private Integer code;
    private T data;
    private String message;
}
