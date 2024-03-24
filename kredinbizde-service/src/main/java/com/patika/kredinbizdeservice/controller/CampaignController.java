package com.patika.kredinbizdeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.patika.kredinbizdeservice.service.CampaignService;
import com.patika.kredinbizdeservice.model.Campaign;
import org.springframework.http.HttpStatus;
import java.util.List;

@RestController
@RequestMapping("api/campaigns")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    @Autowired
    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Campaign create(Campaign campaign) {
        return campaignService.save(campaign);
    }

    @GetMapping
    public List<Campaign> getAll() {
        return campaignService.getAll();
    }

}
