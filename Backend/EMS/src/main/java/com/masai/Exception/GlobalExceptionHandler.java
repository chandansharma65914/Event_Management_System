package com.masai.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> getExceptoinForNoHandler(NoHandlerFoundException e, WebRequest w){

		return new ResponseEntity<ErrorDetails>(new ErrorDetails(LocalDateTime.now(), e.getMessage(),w.getDescription(false)), HttpStatus.BAD_GATEWAY);
	}
     
	
	
	@ExceptionHandler(AttendeeNotFoundException.class)
	
	public ResponseEntity<ErrorDetails> getExceptoinForNotAttendeeFound(AttendeeNotFoundException e, WebRequest w){

		return new ResponseEntity<ErrorDetails>(new ErrorDetails(LocalDateTime.now(), e.getMessage(),w.getDescription(false)), HttpStatus.BAD_GATEWAY);
	}
     
@ExceptionHandler(EventNotFoundException.class)
	
	public ResponseEntity<ErrorDetails> getExceptoinForNoEventFound(EventNotFoundException e, WebRequest w){

		return new ResponseEntity<ErrorDetails>(new ErrorDetails(LocalDateTime.now(), e.getMessage(),w.getDescription(false)), HttpStatus.BAD_GATEWAY);
	}



}
