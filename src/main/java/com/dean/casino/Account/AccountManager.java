package com.dean.casino.Account;

public interface AccountManager {

    Account createAccount(String accountName, String password, float initialBalance);
    void closeAccount(String accountName, String password); //add throws for accountNotFound and wrongCredentials
}
