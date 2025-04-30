package com.ecom.app.exceptions;

import com.ecom.app.payload.APIResponse;
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
    public ResponseEntity<APIResponse> myResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        APIResponse apiResponse  = new APIResponse(resourceNotFoundException.getMessage(),false);

        return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(APIException.class)
    public ResponseEntity<APIResponse> myAPIException(APIException apiException){
        APIResponse apiResponse  = new APIResponse(apiException.getMessage(),false);
        return new ResponseEntity<>(apiResponse,HttpStatus.BAD_REQUEST);
    }
}
