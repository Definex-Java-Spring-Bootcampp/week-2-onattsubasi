package com.patika.kredinbizdeservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.User;
import com.patika.kredinbizdeservice.service.ApplicationService;
import java.util.List;

@RestController
@RequestMapping("api/applications")
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
    
    @GetMapping
    public ResponseEntity<Application> getByEmail(@RequestParam String email) {
        
        List<Application> applicationList = applicationService.getByEmail(email);
        
        if (applicationList != null){
            return ResponseEntity.ok().body(applicationList.get(0));
        
        }
        
        return ResponseEntity.notFound().build();
    }

}
