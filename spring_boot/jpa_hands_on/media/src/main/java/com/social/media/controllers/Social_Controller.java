package com.social.media.controllers;

import com.social.media.models.Social_User;
import com.social.media.service.Social_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Social_Controller {
    @Autowired
    private Social_Service socialService;

    public ResponseEntity<List<Social_User>>  getUsers(){
        return new ResponseEntity<>(socialService.getAllUsers(), HttpStatus.OK);
    }

}
