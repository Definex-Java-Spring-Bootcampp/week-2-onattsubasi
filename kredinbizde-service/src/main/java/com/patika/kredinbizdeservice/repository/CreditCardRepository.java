package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.CreditCard;
import java.util.ArrayList;
import java.util.List;

public class CreditCardRepository {
    
    private List<CreditCard> creditCardList = new ArrayList<>();

    public void save(CreditCard creditCard) {
        
        creditCardList.add(creditCard);
    
    }

    public List<CreditCard> getAll() {
        
        return creditCardList;
    
    }


}
