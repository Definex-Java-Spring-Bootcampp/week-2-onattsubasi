package com.patika.kredinbizdeservice.service;

import org.springframework.stereotype.Service;
import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.repository.CreditCardRepository;
import java.util.List;

@Service
public class CreditCardService {

    private CreditCardRepository creditCardRepository = new CreditCardRepository();

    public CreditCard save(CreditCard creditCard) {
        
        creditCardRepository.save(creditCard);
        
        return creditCard;
    }

    public List<CreditCard> getAll() {
        
        return creditCardRepository.getAll();
    
    }

}
