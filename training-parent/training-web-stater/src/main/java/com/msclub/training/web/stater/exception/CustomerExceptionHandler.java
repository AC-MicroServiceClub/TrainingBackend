package com.msclub.training.web.stater.exception;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(CustomerExceptionHandler.class);

	@ExceptionHandler(value = Throwable.class)
	public ResponseEntity<String> handleThrowable(Throwable throwable) {
		logger.error("error occured!", throwable);
		String response = MessageFormat.format("{\"description\":\"{0}\"}", throwable.getMessage());
		ResponseEntity<String> responseEntity = new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		return responseEntity;
	}
}
