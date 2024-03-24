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

    
}
