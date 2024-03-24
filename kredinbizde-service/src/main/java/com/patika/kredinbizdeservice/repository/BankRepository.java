package com.patika.kredinbizdeservice.repository;

import java.util.List;
import java.util.ArrayList;
import com.patika.kredinbizdeservice.model.Bank;

public class BankRepository {

    private List<Bank> bankList = new ArrayList<>();

    public void save(Bank bank) {
    
        bankList.add(bank);
    
    }

    public List<Bank> getAll() {
    
        return bankList;
    
    }

    public void delete(Bank bank) {
    
        bankList.remove(bank);
    
    }


}