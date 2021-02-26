package com.toggle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toggle.model.UserProfile;
import com.toggle.repository.UserProfileRepository;

@RestController
public class UserProfileController {

    @Autowired
    UserProfileRepository userProfileRepository;

    @RequestMapping("/userprofile/findAll")
    public Iterable<UserProfile> userProfileFindAll() {
        return userProfileRepository.findAll();
    }
    
    @RequestMapping("/userProfile/findByUserId")
    public UserProfile userProfileFindByUserId(@RequestParam Integer userId) {
        return userProfileRepository.findById(userId).get();
    }

}
