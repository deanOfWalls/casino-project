package com.dean.casino.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountService implements AccountManager{
    private final Map<String, Account> accounts = new HashMap<>();

    @Override
    public Account createAccount(String accountName, String password, float initialBalance) {
        if(accounts.containsKey(accountName)){
            throw new IllegalArgumentException("Account already exists!");
        }
        Account account = new Account(accountName, password, initialBalance);
        accounts.put(accountName, account);
        return account;
    }

    @Override
    public void closeAccount(String accountName, String password) {

    }
}
