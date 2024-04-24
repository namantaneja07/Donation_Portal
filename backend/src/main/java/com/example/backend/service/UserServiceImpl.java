package com.example.backend.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.backend.pojo.User;
import com.example.backend.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    UserRepo userrepo;

    @Override
   public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        userrepo.save(getUserFromMap(requestMap));
        return null;
       
     
    }
    private User getUserFromMap(Map<String,String> requestMap) {
        User user=new User();
        user.setuName(requestMap.get("uName"));
        user.setuEmail(requestMap.get("uEmail"));
        user.setuPassword(requestMap.get("uPassword"));
        user.setuContact(requestMap.get("uContact"));
        user.setuAddress(requestMap.get("uAddress"));
        user.setRole("user");
        return user;
       
    }
   
    

}
