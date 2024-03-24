package com.patika.kredinbizdeservice.managers;
import java.util.List;
import java.util.ArrayList;
import com.patika.kredinbizdeservice.model.*;

public class BankManager {
    private List<Bank> bankList;

    public BankManager(){
        bankList = new ArrayList<>();
    }

    public synchronized Bank createBank(String name){

        Bank temp = new Bank(name);
        bankList.add(temp);
        
        return temp;
    }
    
    public synchronized void listBanks(){
        bankList.forEach(b -> {
            System.out.println(b.getName());
        });
    }
}
