package Aula156.entities;

public class BusinessAccount extends Account{

    private double loanLimit;

    public BusinessAccount(){super();}

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double value){
        if(value <= loanLimit) balance += value - 10 ;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }


}
