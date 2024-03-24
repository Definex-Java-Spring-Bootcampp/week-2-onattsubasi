package com.patika.kredinbizdeservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.User;
import com.patika.kredinbizdeservice.service.ApplicationService;
import java.util.List;

public class ApplicationController {
    
    @Autowired
    private ApplicationService applicationService = new ApplicationService();

    @Autowired
    public Application create(Application application) {
    
        return applicationService.save(application);
    
    }
    
    @GetMapping
    public List<Application> getAll() {
    
        return applicationService.getAll();
    
    }
    
    @GetMapping("/{user}")
    public List<Application> getByUser(User user) {
    
        return applicationService.getByUser(user);
    
    }
    
    @PutMapping("/{email}")
    public ResponseEntity<Application> update(@PathVariable String email, @RequestBody Application application) {
        
        Application application1 = applicationService.update(email, application);
        
        if (application1 != null){
            return ResponseEntity.ok().body(application1);
        
        }
        
        return ResponseEntity.notFound().build();
    }

}
