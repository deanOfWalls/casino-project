package com.dean.casino.Account;

import javax.security.auth.login.AccountNotFoundException;
import javax.security.auth.login.CredentialException;

public interface TransactionManager {

    float getBalance();
    void deposit(float amount);
    void withdraw(float amount);
}
