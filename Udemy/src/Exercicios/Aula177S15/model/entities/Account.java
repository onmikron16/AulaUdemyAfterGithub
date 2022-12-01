package Exercicios.Aula177S15.model.entities;

import Exercicios.Aula177S15.model.exception.AccountException;

public class Account {

    private Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;


    public Account(Integer number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }


    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws AccountException {
        if(withdrawLimit < amount){
            throw new AccountException("The amount exceeds withdraw limit");
        } else if (balance < amount) {
            throw new AccountException("Not enough balance");
        } else {
            balance -= amount;
        }
    }



    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
