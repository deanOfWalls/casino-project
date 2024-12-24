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
            float balance = getBalance();
            setAccountBalance(balance + amount);
        }
    }

    @Override
    public void withdraw(float amount) {
        if (getBalance() > 0 && amount > 0 && amount <= getBalance()) {
            float balance = getBalance();
            setAccountBalance(balance - amount);
        }
    }

    @Override
    public Account createAccount(String accountName, String password, float initialBalance) {
        return new Account(accountName, password, initialBalance);
    }

    @Override
    public void closeAccount(String accountName, String password) throws AccountNotFoundException, CredentialException {
        //complete logic after db implemented
    }
}
