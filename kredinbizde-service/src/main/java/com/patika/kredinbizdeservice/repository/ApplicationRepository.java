package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public class ApplicationRepository {
    
    private List<Application> applicationList = new ArrayList<>();


    public void save(Application application) {
    
        applicationList.add(application);

    }

    public List<Application> getAll() {
    
        return applicationList;
    
    }

    public List<Application> getByUser(User user) {
    
        return applicationList.stream()
                .filter(application -> application.getUser().equals(user))
                .collect(Collectors.toList());
    
            }

    public List<Application> getByEmail(String email) {
    
        return applicationList.stream()
                .filter(application -> application.getUser().getEmail().equals(email))
                .collect(Collectors.toList());
    
            }

    public Optional<Application> findByUser(User user) {
    
        return applicationList.stream()
                .filter(application -> application.getUser().equals(user))
                .findFirst();
    
            }

    public Optional<Application> findByEmail(String email) {

        return applicationList.stream()
                .filter(application -> application.getUser().getEmail().equals(email))
                .findFirst();
    
            }

    public void delete(Application application) {
    
        applicationList.remove(application);
    
    }



}