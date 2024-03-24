package com.patika.kredinbizdeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.http.HttpStatus;
import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.service.CreditCardService;

@RestController
@RequestMapping("api/credit-cards")
public class CreditCardController {

    private CreditCardService creditCardService;

    @Autowired
    public CreditCardController(CreditCardService creditCardService) {
    
        this.creditCardService = creditCardService;
    
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreditCard create(CreditCard creditCard) {
    
        return creditCardService.save(creditCard);
    
    }

    @GetMapping
    public List<CreditCard> getAll() {
    
        return creditCardService.getAll();
    
    }


}
