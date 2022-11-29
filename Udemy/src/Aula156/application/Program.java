package Aula156.application;

import Aula156.entities.Account;
import Aula156.entities.BusinessAccount;
import Aula156.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {
        Account acc1 = new Account(102,"alex",1000d);

        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(102,"alex",1000d,10d);
        acc2.withdraw(200);

        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(102,"alex",1000d,10d);
        acc3.withdraw(200);

        System.out.println(acc3.getBalance());


    }
}
