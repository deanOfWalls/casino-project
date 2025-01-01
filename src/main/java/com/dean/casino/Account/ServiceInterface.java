package com.dean.casino.Account;

import java.util.HashMap;
import java.util.Map;

public interface ServiceInterface {

    // Centralized storage for accounts
    Map<String, Account> accounts = new HashMap<>();

    // default method for creating an account
    default Account createAccount(String accountName, String password, float initialBalance) {
        if (accounts.containsKey(accountName)) {
            throw new IllegalArgumentException("Account already exists!");
        }
        Account account = new Account(accountName, password, initialBalance);
        accounts.put(accountName, account);
        return account;
    }

    // default method for closing an account
    default void closeAccount(String accountName, String password) {
        Account account = accounts.get(accountName);
        if (account == null) {
            throw new IllegalArgumentException("Account not found!");
        }
        //conditional to check for incorrect password. need method in AccountService
        if(!account.validatePassword(password, account)){
            throw new IllegalArgumentException("Incorrect password!");
        }
        accounts.remove(accountName);
    }
}