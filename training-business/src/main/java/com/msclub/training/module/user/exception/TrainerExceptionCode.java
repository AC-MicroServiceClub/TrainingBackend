package com.msclub.training.module.user.exception;

import org.springframework.http.HttpStatus;

import com.msclub.base.model.CommonResponseCode;
import com.msclub.base.model.ErrorCode;
import com.msclub.base.model.IssueType;

public class TrainerExceptionCode extends ErrorCode {

	public TrainerExceptionCode(String code, String message, IssueType issueType, HttpStatus httpStatus) {
		super(code, message, issueType.name(), httpStatus);
	}

	public static final ErrorCode ERROR_010001 = new CommonResponseCode("ERROR_010001", "No data found in database",
			IssueType.EXCEPTION, HttpStatus.NOT_FOUND);

	public static final ErrorCode ERROR_010002 = new CommonResponseCode("ERROR_010002", "Database cannot be connected.",
			IssueType.EXCEPTION, HttpStatus.NOT_FOUND);
	
	public static final ErrorCode ERROR_010003 = new CommonResponseCode("ERROR_010003", "Requested training ids is empty.",
			IssueType.EXCEPTION, HttpStatus.NOT_FOUND);
}
