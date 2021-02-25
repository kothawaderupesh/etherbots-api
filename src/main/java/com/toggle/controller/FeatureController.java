package com.toggle.controller;

import com.toggle.model.Feature;
import com.toggle.repository.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureController {

    @Autowired
    FeatureRepository featureRepository;

    @RequestMapping("/feature/findAll")
    public Iterable<Feature> hello() {
        return featureRepository.findAll();
    }

}
