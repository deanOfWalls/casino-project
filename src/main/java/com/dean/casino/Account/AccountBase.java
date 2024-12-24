package com.dean.casino.Account;

public abstract class AccountBase implements Manager{
    protected String accountName;
    protected String password;
    protected float accountBalance;

    public AccountBase(String accountName, String password, float accountBalance) {
        this.accountName = accountName;
        this.password = password;
        this.accountBalance = accountBalance;
    }
}
