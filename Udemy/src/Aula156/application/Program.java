package Aula156.application;

import Aula156.entities.Account;
import Aula156.entities.BusinessAccount;
import Aula156.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {
        Account acc = new Account(102,"alex",0d);
        BusinessAccount bacc = new BusinessAccount(103,"maria",0d,500);

        //upcasting
        Account acc1 = bacc;
        Account acc2  = new BusinessAccount(104,"bob",0d,200);

        Account acc3 = new SavingsAccount(105,"ana",0d,0.01);


        // downcasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100d);

       // BusinessAccount acc5 = (BusinessAccount) acc3;

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200d);
            System.out.println("LOAN!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 =(SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("UPDATE!");
        }
    }
}
