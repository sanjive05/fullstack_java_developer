package com.social.media.controllers;

import com.social.media.models.Social_User;
import com.social.media.service.Social_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Social_Controller {
    @Autowired
    private Social_Service socialService;

    @GetMapping("/social/users")
    public ResponseEntity<List<Social_User>>  getUsers(){
        return new ResponseEntity<>(socialService.getAllUsers(), HttpStatus.OK);
    }
    @PostMapping("/social/users")
    public ResponseEntity<Social_User> saveUsers(@RequestBody Social_User socialUser){
        return new ResponseEntity<>(socialService.saveUsers(socialUser), HttpStatus.CREATED);
    }

}
