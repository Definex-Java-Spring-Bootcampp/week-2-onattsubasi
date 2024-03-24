package com.patika.kredinbizdeservice.repository;

import java.util.List;
import java.util.ArrayList;
import com.patika.kredinbizdeservice.model.Campaign;

public class CampaignRepository {
    
    private List<Campaign> campaignList = new ArrayList<>();

    public void save(Campaign campaign) {
    
        campaignList.add(campaign);
    
    }

    public List<Campaign> getAll() {
    
        return campaignList;
    
    }

    public void delete(Campaign campaign) {
    
        campaignList.remove(campaign);
    
    }

    public List<Campaign> listByDateDescending(){
    
        List<Campaign> sortedList = new ArrayList<>(campaignList);
        sortedList.sort((c1, c2) -> c2.getCreateDate().compareTo(c1.getCreateDate()));

        return sortedList;

    }

    public List<Campaign> listByDateAscending(){
    
        List<Campaign> sortedList = new ArrayList<>(campaignList);
        sortedList.sort((c1, c2) -> c1.getCreateDate().compareTo(c2.getCreateDate()));

        return sortedList;

    }

}
