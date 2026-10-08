package com.gaurav.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> exceptionHandler(Exception e){
		ErrorMessage em = new ErrorMessage();
		em.setMessage(e.getMessage());
		em.setStatusCode(HttpStatus.BAD_REQUEST.value());
		em.setLocalDate(LocalDateTime.now());
		return new ResponseEntity<ErrorMessage>(em, HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(CompanyException.class)
	public ResponseEntity<ErrorMessage> CompanyException(CompanyException e){
		ErrorMessage em = new ErrorMessage();
		em.setMessage(e.getMessage());
		em.setStatusCode(HttpStatus.BAD_REQUEST.value());
		em.setLocalDate(LocalDateTime.now());
		return new ResponseEntity<ErrorMessage>(em, HttpStatus.BAD_GATEWAY);
	}
}
