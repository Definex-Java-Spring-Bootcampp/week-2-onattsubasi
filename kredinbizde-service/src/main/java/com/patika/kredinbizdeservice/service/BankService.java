package com.patika.kredinbizdeservice.service;

import org.springframework.stereotype.Service;
import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.repository.BankRepository;
import java.util.List;

@Service
public class BankService {
    
    private BankRepository bankRepository = new BankRepository();

    public Bank save(Bank bank) {
        
        bankRepository.save(bank);
        
        return bank;
    }

    public List<Bank> getAll() {
        
        return bankRepository.getAll();
    
    }

    public void delete(Bank bank) {
        
        bankRepository.delete(bank);
    
    }
}
