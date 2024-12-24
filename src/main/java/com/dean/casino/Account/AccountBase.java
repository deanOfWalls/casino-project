package com.dean.casino.Account;

public abstract class AccountBase implements Manager{
    private String accountName;
    private String password;
    private float accountBalance;

    public AccountBase(String accountName, String password, float accountBalance) {
        this.accountName = accountName;
        this.password = password;
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }
}
