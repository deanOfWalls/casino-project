package com.dean.casino.Account;

public interface AccountInterface {

    float getBalance();

    void setAccountBalance(float newBalance);

    // default method for depositing funds
    default void deposit(float amount) {
        if (amount > 0) {
            float currentBalance = getBalance();
            setAccountBalance(currentBalance + amount);
        }
    }

    // default method for withdrawing funds
    default void withdraw(float amount) {
        float currentBalance = getBalance();
        if (currentBalance > 0 && amount > 0 && amount <= currentBalance) {
            setAccountBalance(currentBalance - amount);
        }
    }

    default boolean validatePassword(String inputPassword, AbstractAccount account){
        return account.getPassword().equals(inputPassword);
    }
}
