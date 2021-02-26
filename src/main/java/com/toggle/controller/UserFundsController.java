package com.toggle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toggle.model.UserFunds;
import com.toggle.repository.UserFundsRepository;

@RestController
public class UserFundsController {

    @Autowired
    UserFundsRepository userFundsRepository;

    @RequestMapping("/userFunds/findAll")
    public Iterable<UserFunds> userFundsFindAll() {
        return userFundsRepository.findAll();
    }

    @RequestMapping("/userFunds/findByUserFundId")
    public UserFunds userFundsFindByUserId(@RequestParam Integer userFundId) {
        return userFundsRepository.findById(userFundId).get();
    }
}
