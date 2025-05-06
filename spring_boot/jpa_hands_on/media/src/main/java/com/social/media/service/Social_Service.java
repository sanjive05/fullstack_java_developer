package com.social.media.service;

import com.social.media.models.Social_User;
import com.social.media.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Social_Service {

    @Autowired
    private UserRepository userRepository;

    public List<Social_User> getAllUsers() {
        return userRepository.findAll();
    }

    public Social_User saveUsers(Social_User socialUser) {
        Social_User savedUser = userRepository.save(socialUser);
        return savedUser;
    }
}
