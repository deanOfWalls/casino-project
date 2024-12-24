package com.dean.casino.Account;

import javax.security.auth.login.AccountNotFoundException;
import javax.security.auth.login.CredentialException;

public interface Manager {

    float getBalance();
    void deposit(float amount);
    void withdraw(float amount);
    Account createAccount(String accountName, String password, float initialBalance);
    void closeAccount(String accountName, String password) throws AccountNotFoundException, CredentialException; //CredentialException might be wrong
}
