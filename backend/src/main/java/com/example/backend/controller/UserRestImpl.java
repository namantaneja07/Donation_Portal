package com.example.backend.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.service.UserService;

@RestController
public class UserRestImpl implements UserRest{
 
    @Autowired
    UserService userservice;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try {
           
            return userservice.signUp(requestMap);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<String>("{\"message\":\"Something went Wrong\"}",HttpStatus.INTERNAL_SERVER_ERROR);
        }
 
   
 
   
   
 
 
   
 
}
