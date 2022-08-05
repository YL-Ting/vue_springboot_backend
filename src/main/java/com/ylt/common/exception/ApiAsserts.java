package com.ylt.common.exception;

import com.ylt.common.api.IErrorCode;

public class ApiAsserts {
/*
 * 拋出失敗異常
 * ＠param message 說明
 */
	public static void fail(String message) {
		throw new ApiException(message);
	}
/*
 * 拋出失敗異常
 * @param errorCode 狀態碼
 */
	public static void fail(IErrorCode errorCode) {
		throw new ApiException(errorCode);
	}
}
