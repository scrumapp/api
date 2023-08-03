package com.example.ScrumAPI.scrumapi.utils;

import com.example.ScrumAPI.scrumapi.utils.exception.NotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFound.class)
    public ResponseEntity<Map<String,String>> handleException(Exception e){
        return Util.getErrorResponse(e.getMessage(), HttpStatus.BAD_REQUEST);

    }

}
