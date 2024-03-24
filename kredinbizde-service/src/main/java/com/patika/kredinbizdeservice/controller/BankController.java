package com.patika.kredinbizdeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.http.HttpStatus;
import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.service.BankService;

@RestController
@RequestMapping("api/banks")
public class BankController {

    @Autowired
    private BankService bankService;

    @Autowired
    public BankController(BankService bankService) {
    
        this.bankService = bankService;
    
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bank create(Bank bank) {
    
        return bankService.save(bank);
    
    }

    @GetMapping
    public List<Bank> getAll() {
    
        return bankService.getAll();
    
    }


}
