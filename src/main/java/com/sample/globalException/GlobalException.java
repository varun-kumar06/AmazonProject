package com.sample.globalException;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sample.exception.ProductNotFound;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(ProductNotFound.class)
	public ResponseEntity<String> re (ProductNotFound pn) {
		return new ResponseEntity<>("Search another Product", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<String> rr(NumberFormatException ne) {
		return new ResponseEntity<>("Char not accepted", HttpStatus.BAD_GATEWAY);
	}
  
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> ree(NoSuchElementException nee) {
		return new ResponseEntity<>("No Such ElementException", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IndexOutOfBoundsException.class)
	public ResponseEntity<String> rr(IndexOutOfBoundsException tt) { 
		return new ResponseEntity<>("IndexoutOfBoundException", HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(IndexOutOfBoundsException.class)
	public ResponseEntity<String> ree1(IndexOutOfBoundsException nee1) {
		return new ResponseEntity<>("Indext Out ", HttpStatus.BAD_REQUEST);
	}
	
}
