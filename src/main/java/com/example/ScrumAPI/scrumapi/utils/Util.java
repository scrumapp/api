package com.example.ScrumAPI.scrumapi.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class Util {

    public static ResponseEntity<Map<String, String>> getCreateSuccessResponse(String message) {
        Map<String, String> response = new HashMap<>();
        response.put("message", message);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }
    public static ResponseEntity<Map<String,String>> getDeletSuccessResponse(String message){
        Map<String,String> response = new HashMap<>();
        response.put("message",message);
        return new ResponseEntity<>(response,HttpStatus.OK);

    }
    public static ResponseEntity<Map<String,String>> getErrorResponse(String message,HttpStatus code) {
        Map<String, String> response = new HashMap<>();
        response.put("message", message);
        return new ResponseEntity<>(response,code);
    }
}
