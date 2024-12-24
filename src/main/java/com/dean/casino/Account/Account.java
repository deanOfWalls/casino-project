package com.dean.casino.Account;

import javax.security.auth.login.AccountNotFoundException;
import javax.security.auth.login.CredentialException;

public class Account extends AccountBase {

    public Account(String accountName, String password, float accountBalance) {
        super(accountName, password, accountBalance);
    }

    @Override
    public float getBalance() {
        return accountBalance;
    }

    @Override
    public void deposit(float amount) {
        if (amount > 0) {
            accountBalance += amount;
        }
    }

    @Override
    public void withdraw(float amount) {
        if (accountBalance > 0 && amount > 0) {
            accountBalance -= amount;
        }
    }

    @Override
    public Account createAccount(String accountName, String password, float initialBalance) {
        return null;
    }

    @Override
    public void closeAccount(String accountName, String password) throws AccountNotFoundException, CredentialException {

    }
}
