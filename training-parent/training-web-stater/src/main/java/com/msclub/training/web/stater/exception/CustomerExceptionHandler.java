package com.msclub.training.web.stater.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.msclub.base.exception.BaseException;
import com.msclub.training.web.stater.model.CommonResponse;
import com.msclub.training.web.stater.util.RestClientUtil;

@RestControllerAdvice
public class CustomerExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(CustomerExceptionHandler.class);

	@Autowired
	private RestClientUtil restClientUtil;

	@ExceptionHandler(value = Throwable.class)
	public ResponseEntity<CommonResponse> handleThrowable(Throwable throwable) {
		logger.error("error occured!", throwable);

		CommonResponse response = restClientUtil.buildFailedCommonResponse(throwable.getMessage());
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		if (throwable instanceof BaseException) {
			status = ((BaseException) throwable).getHttpStatus();
		}
		ResponseEntity<CommonResponse> responseEntity = new ResponseEntity<>(response, status);
		return responseEntity;
	}
}
