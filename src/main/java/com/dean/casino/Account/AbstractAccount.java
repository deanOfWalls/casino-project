package com.dean.casino.Account;

abstract public class AbstractAccount implements AccountInterface {
    private String accountName;
    private String password;
    private float accountBalance;

    public AbstractAccount(String accountName, String password, float accountBalance) {
        this.accountName = accountName;
        this.password = password;
        this.accountBalance = accountBalance;
    }

    //the only methods we have in an abstract class are related to state
    @Override
    public float getBalance() {
        return accountBalance;
    }

    @Override
    public void setAccountBalance(float newBalance) {
        this.accountBalance = newBalance;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountName() {
        return accountName;
    }
}
