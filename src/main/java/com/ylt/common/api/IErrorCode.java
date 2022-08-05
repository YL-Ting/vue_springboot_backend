package com.ylt.common.api;

public interface IErrorCode {
/*
 * status code: -1 error,200 success
 * @return status code
 */
	Integer getCode();
/*
 * Error description
 * @return Error description
 */
	String getMessage();
}
