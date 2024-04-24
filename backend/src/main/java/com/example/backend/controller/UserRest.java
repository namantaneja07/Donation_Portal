package com.example.backend.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path="/user")
@CrossOrigin("*")
public interface UserRest {
    @PostMapping(path="/signUp")
    public ResponseEntity<String> signUp(@RequestBody(required = true)Map<String,String>requestMap);
    

}
