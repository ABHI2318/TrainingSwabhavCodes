package com.aurion.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.aurion.model.Account;

public class StreamAssignBank {
    public static void main(String[] args) {
   
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(101, "abhishek", 900));
        accounts.add(new Account(102, "mood tausif", 2500));
        accounts.add(new Account(103, "asheesh", 800));
        accounts.add(new Account(104, "ashish", 3200));
        accounts.add(new Account(105, "harsh", 1000));

        // a.show Account details of account with minimum Balance
        Account minBalanceAccount = accounts.stream()
                .min(Comparator.comparingDouble(account -> account.getBalance()))
                .orElse(null);

                
        System.out.println("Account with minimum balance: " + minBalanceAccount);

        // b. Show Account details of account with maximum Balance
        Account maxBalanceAccount = accounts.stream()
                .max(Comparator.comparingDouble(account->account.getBalance()))
                .orElse(null);
        System.out.println("Account with maximum balance: " + maxBalanceAccount);

        // c.Show names greater than 6 characters
        List<String> Names = accounts.stream()
                .map(account->account.getName())
                .filter(name -> name.length() > 6)
                .toList(); 
        System.out.println("Names greater than 6 characters: " + Names);

        // d.  find total of balance of all accounts
        double totalBalance = accounts.stream()
                .mapToDouble(account->account.getBalance())
                .sum();
        System.out.println("Total balance of all accounts: " + totalBalance);
    }
}
