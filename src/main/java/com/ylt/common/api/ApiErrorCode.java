package com.ylt.common.api;

public enum ApiErrorCode implements IErrorCode{
//	success
	SUCCESS(200,"操作成功"),
//	fail
	FAILED(-1,"操作失敗"),
//	not logged in ,token expired
	UNAUTHORIZED(401,"暫未登入或token已過期"),
//	insufficient permissions
	FORBIDDEN(403,"權限不足"),
//	argument veridate fail
	VALIDATE_FAILED(404,"參數驗證失敗");
	
	private final Integer code;
	private final String message;
	
	ApiErrorCode(int code,String message){
		this.code = code;
		this.message = message;
	}
	@Override
	public Integer getCode() {
		return code;
	}
	@Override
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return "ApiErrorCode{"+"code="+code+", message="+message+'\''+'}';
	}
}
