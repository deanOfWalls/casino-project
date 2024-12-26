package com.dean.casino.Account;

import javax.security.auth.login.AccountNotFoundException;
import javax.security.auth.login.CredentialException;

public class Account extends AccountBase {

    public Account(String accountName, String password, float accountBalance) {
        super(accountName, password, accountBalance);
    }

    @Override
    public float getBalance() {
        return getAccountBalance();
    }

    @Override
    public void deposit(float amount) {
        if (amount > 0) {
            float currentBalance = getBalance();
            setAccountBalance(currentBalance + amount);
        }
    }

    @Override
    public void withdraw(float amount) {
        float currentBalance = getBalance();
        if (currentBalance > 0 && amount > 0 && amount <= currentBalance) {
            setAccountBalance(currentBalance - amount);
        }
    }

}
