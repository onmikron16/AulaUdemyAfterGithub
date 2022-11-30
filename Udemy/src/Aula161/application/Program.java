package Aula161.application;

import Aula161.entities.Employee;
import Aula161.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees:");
        int n = sc.nextInt();

        for(int i=0;i<n; i++){
            System.out.println("Employee #"+ (1+1)+  " data:");
            System.out.print("Outsouced (y/n)?: ");
            char ch = sc.next().charAt(0);
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hours: ");
            double valuePerHour = sc.nextDouble();

            if(ch == 'y'){
                System.out.print("addtion charge: ");
                double additionCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name,hours,valuePerHour,additionCharge));

            }else{
                list.add(new Employee(name,hours,valuePerHour));
            }
            }


        System.out.println();

        System.out.println("Payment:");

        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));


        }

    }
}
