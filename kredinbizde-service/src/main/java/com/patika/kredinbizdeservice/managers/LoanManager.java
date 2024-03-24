package com.patika.kredinbizdeservice.managers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.patika.kredinbizdeservice.model.*;

public class LoanManager {

    private List<Loan> loanList;

    public LoanManager() {
        loanList = new ArrayList<>();
    
    }

    public synchronized Loan createLoan(String type, BigDecimal amount, Integer installment, Double interestRate, Bank bank) {
        Loan temp = null;
       
        if (type.equalsIgnoreCase("house")) {
            temp = new HouseLoan(amount, installment, interestRate, bank);
       
        } else if (type.equalsIgnoreCase("consumer")) {
            temp = new ConsumerLoan(amount, installment, interestRate, bank);
       
        } else if(type.equalsIgnoreCase("vehicle")) {
            temp = new VehicleLoan(amount, installment, interestRate, bank);
       
        }else {
            System.out.println("Invalid product type: " + type);
            return null;
        }
        if(bank.getLoanList() == null){
            List<Loan> newloanList = new ArrayList<>();
            bank.setLoanList(newloanList);
        
        }
        
        bank.addLoan(temp);
        loanList.add(temp);
        return temp;
    }
}