package Aula156.entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){}


    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance*interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    @Override
    public void withdraw(double value){
        balance -= value;

    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
