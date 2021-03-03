package com.time.common.base.model;


import org.springframework.http.HttpStatus;

/**
 * @param <T>
 * @author yanghao
 * @description 标准化返回类型格式
 */
public class R<T> {
    /**
     * 返回码
     */
    private Integer code;

    /**
     * 错误消息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public R() {
        super();
    }

    public R(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static <T> R<T> ok(T data) {
        return new R<T>(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), data);
    }

    public static <T> R<T> fail(Integer code, String msg) {
        return new R<T>(code, msg);
    }

    public static R ok() {
        return new R(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase());
    }

    public static R fail() {
        return new R(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
    }

}
