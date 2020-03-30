package com.ares.webservice.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ares.webservice.services.exceptions.DatabaseException;
import com.ares.webservice.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionsHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException exception, HttpServletRequest request) {
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		
		StandardError err = new StandardError(Instant.now(), status.value(), error, exception.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(status).body(err); 
	}
	
	@ExceptionHandler(DatabaseException.class) 
	public ResponseEntity<StandardError> databaseExceptiom(DatabaseException dbe, HttpServletRequest request) {
		String error = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		
		StandardError err = new StandardError(Instant.now(), status.value(), error, dbe.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}
	
}
