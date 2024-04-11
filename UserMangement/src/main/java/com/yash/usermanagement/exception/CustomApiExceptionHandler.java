package com.yash.usermanagement.exception;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomApiExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = CustomApiException.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request)  {
		List<String> details = new ArrayList<>();
		details.add(ex.getMessage());
		details.add(request.getContextPath());
		return new ResponseEntity<>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
