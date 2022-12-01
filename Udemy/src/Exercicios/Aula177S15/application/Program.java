package Exercicios.Aula177S15.application;

import Exercicios.Aula177S15.model.entities.Account;
import Exercicios.Aula177S15.model.exception.AccountException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("holder: ");
        String holder = sc.next();
        System.out.print("Initial balance: ");
        double initialbalance = sc.nextDouble();
        System.out.print("withdraw limit: ");
        double limitwithdraw = sc.nextDouble();

        Account acc = new Account(number,holder,initialbalance,limitwithdraw);

        System.out.print("Enter amount for withdraw: ");
        double withdraw = sc.nextDouble();

            acc.withdraw(withdraw);
            System.out.println(acc);

        } catch (AccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }


    }
}
