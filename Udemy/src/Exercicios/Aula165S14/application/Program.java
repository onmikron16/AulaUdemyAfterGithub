package Exercicios.Aula165S14.application;

import Exercicios.Aula165S14.entities.Company;
import Exercicios.Aula165S14.entities.Individual;
import Exercicios.Aula165S14.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<TaxPayer> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers:");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){


            System.out.println("Tax payer #"+(1+i)+" data:");
            System.out.print("Individual or company (i/c):");
            char resp = sc.next().charAt(0);

            System.out.print("name:");
            String name = sc.next();

            System.out.print("Anual income:");
            double anualincome = sc.nextDouble();

            if(resp == 'i'){
                System.out.print("Health expenditures");
                double health = sc.nextDouble();
                list.add(new Individual(name,anualincome,health));
            } else if (resp == 'c'){
                System.out.print("Number of employees:");
                int employee = sc.nextInt();
                list.add(new Company(name,anualincome,employee));
            }

        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for(TaxPayer tp : list){
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
