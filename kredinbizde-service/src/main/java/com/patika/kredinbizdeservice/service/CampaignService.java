package com.patika.kredinbizdeservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.repository.CampaignRepository;

@Service
public class CampaignService {
    
    private CampaignRepository campaignRepository = new CampaignRepository();

    public Campaign save(Campaign campaign) {
        
        campaignRepository.save(campaign);
        
        return campaign;
    }

    public List<Campaign> getAll() {
    
        return campaignRepository.getAll();
    
    }

    public void delete(Campaign campaign) {
    
        campaignRepository.delete(campaign);
    
    }

    public List<Campaign> listByDateDescending() {
    
        return campaignRepository.listByDateDescending();
    
    }

    public List<Campaign> listByDateAscending() {
     
        return campaignRepository.listByDateAscending();
    
    }
}
