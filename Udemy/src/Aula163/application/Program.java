package Aula163.application;


import Aula163.entities.Account;
import Aula163.entities.BusinessAccount;
import Aula163.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {


		List<Account> list = new ArrayList<>();


		list.add(new SavingsAccount(1001,"alex",500d,10d));
		list.add(new BusinessAccount(1003,"maria",1000d,10d));
		list.add(new SavingsAccount(1005,"bob",300d,5004d));
		list.add(new BusinessAccount(1003,"jh",500d,1220d));

		double sum = 0d;

		for(Account acc : list){
			sum =+ acc.getBalance();
		}
		System.out.printf("Total balance: %.2f\n",sum);
		for(Account acc : list){
			acc.deposit(10);
		}

		for(Account acc : list) {
			System.out.printf("Updated balance for Account %d: %.2f\n",acc.getNumber(),acc.getBalance());
		}

		}
}
