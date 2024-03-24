package com.patika.kredinbizdeservice.service;

import org.springframework.stereotype.Service;
import com.patika.kredinbizdeservice.model.User;
import java.util.List;
import java.util.Optional;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.repository.ApplicationRepository;

@Service
public class ApplicationService {
    
    private ApplicationRepository applicationRepository = new ApplicationRepository();

    public Application save(Application application) {
        
        applicationRepository.save(application);

        return application;
    }

    public List<Application> getAll() {
    
        return applicationRepository.getAll();

    }

    public List<Application> getByUser(User user) {
    
        return applicationRepository.getByUser(user);

    }

    public List<Application> getByEmail(String email) {
    
        return applicationRepository.getByEmail(email);

    }

    public Application update(String email, Application application) {
    
        Optional<Application> foundApplication = applicationRepository.findByUser(email);
        
        foundApplication.get().setLoan(application.getLoan());
        
        foundApplication.get().setUser(application.getUser());
        
        applicationRepository.delete(application);

        applicationRepository.save(application);

        return foundApplication.get();
    }


}
