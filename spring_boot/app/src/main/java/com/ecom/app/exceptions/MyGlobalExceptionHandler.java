package com.ecom.app.exceptions;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice

public class MyGlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> methodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException){
        Map<String,String> response = new HashMap<>();
        methodArgumentNotValidException.getBindingResult().getAllErrors()
                .forEach(e->{
                    String fieldName = ((FieldError)e).getField();
                    String message = e.getDefaultMessage();
                    response.put(fieldName,message);
                });
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);

    }
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> myResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        String message = resourceNotFoundException.getMessage();
        return new ResponseEntity<>(message,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(APIException.class)
    public ResponseEntity<String> myAPIException(APIException apiException){
        String message = apiException.getMessage();
        return new ResponseEntity<>(message,HttpStatus.BAD_REQUEST);
    }
}
