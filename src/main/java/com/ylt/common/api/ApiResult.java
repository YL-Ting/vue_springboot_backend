package com.ylt.common.api;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Optional;


@Data
@NoArgsConstructor
public class ApiResult<T> implements Serializable {

    private static final long serialVersionUID = -4153430394359594346L;
    /*
     * service status code
     */
    private long code;
    /*
     * result set
     */
    private T data;
    /*
     * description
     */
    private String message;

    /**
     * 全參數
     *
     * @param code    服務狀態碼
     * @param message 訊息描述
     * @param data    結果集
     */
    public ApiResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiResult(IErrorCode errorCode) {
        errorCode = Optional.ofNullable(errorCode).orElse(ApiErrorCode.FAILED);
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    /**
     * 成功
     *
     * @param data 結果集
     * @return {code:200,message:操作成功,data:無}
     */
    public static <T> ApiResult<T> success() {
        return new ApiResult<T>(ApiErrorCode.SUCCESS.getCode(), ApiErrorCode.SUCCESS.getMessage(), null);
    }

    /**
     * 成功
     *
     * @param data 結果集
     * @return {code:200,message:操作成功,data:自定義}
     */
    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<T>(ApiErrorCode.SUCCESS.getCode(), ApiErrorCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功
     *
     * @param data    結果集
     * @param message 自定義訊息描述
     * @return {code:200,message:自定義,data:自定義}
     */
    public static <T> ApiResult<T> success(T data, String message) {
        return new ApiResult<T>(ApiErrorCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失敗回傳結果
     */
    public static <T> ApiResult<T> failed() {
        return failed(ApiErrorCode.FAILED);
    }

    /**
     * 失敗回傳結果
     *
     * @param message 訊息描述
     * @return {code:從列舉ApiErrorCode類別取得,message:自定義,data:null}
     */
    public static <T> ApiResult<T> failed(String message) {
        return new ApiResult<T>(ApiErrorCode.FAILED.getCode(), message, null);
    }

    /**
     * 失敗回傳結果
     *
     * @param errorCode 錯誤碼
     * @return {code:從封裝介面取得,message:從封裝介面取得,data:null}
     */
    public static <T> ApiResult<T> failed(IErrorCode errorCode) {
        return new ApiResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失敗回傳結果
     *
     * @param errorCode 錯誤碼
     * @param message   錯誤訊息
     * @return {code:從列舉ApiErrorCode類別取得,message:自定義,data:null}
     */
    public static <T> ApiResult<T> failed(IErrorCode errorCode, String message) {
        return new ApiResult<T>(errorCode.getCode(), message, null);
    }

    /**
     * 參數驗證失敗回傳結果
     */
    public static <T> ApiResult<T> validateFailed() {
        return failed(ApiErrorCode.VALIDATE_FAILED);
    }

    /**
     * 參數驗證失敗回傳結果
     *
     * @param message 訊息描述
     */
    public static <T> ApiResult<T> validateFailed(String message) {
        return new ApiResult<T>(ApiErrorCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登入回傳結果
     */
    public static <T> ApiResult<T> unauthorized(T data) {
        return new ApiResult<T>(ApiErrorCode.UNAUTHORIZED.getCode(), ApiErrorCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授權回傳結果
     */
    public static <T> ApiResult<T> forbidden(T data) {
        return new ApiResult<T>(ApiErrorCode.FORBIDDEN.getCode(), ApiErrorCode.FORBIDDEN.getMessage(), data);
    }
}