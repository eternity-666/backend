package com.example.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 统一返回结果
 * </p>
 * @since 2023-06-02
 * @version v1.0
 * @author chris
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {


    private Integer code;
    private String msg;

    private T data;

    public static <T> Result<T> success() {
        return new Result<>(200, "success", null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(200, "success", data);
    }

    public static <T> Result<T> success(String msg, T data) {
        return new Result<>(200, msg, data);
    }

    public static <T> Result<T> success(String msg) {
        return new Result<>(200, msg, null);
    }

    public static <T> Result<T> fail() {
        return new Result<>(201, "fail", null);
    }

    public static <T> Result<T> fail(Integer code) {
        return new Result<>(201, "fail", null);
    }
    public static <T> Result<T> fail(String msg) {
        return new Result<>(201, msg, null);
    }

    public static <T> Result<T> fail(Integer code,String msg) {
        return new Result<>(code, msg, null);
    }


}
