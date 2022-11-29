package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("BaseSalary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary,new Department(departmentName));

        System.out.println("how to many contracts to this worker?: ");
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            System.out.println("Enter contract #" + (i+1) +  "Data: ");
            System.out.print("Date (DD/MM/YYYY) :");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hour = sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hour);
            worker.addContract(contract);
        }

        System.out.println("");
        System.out.print("Enter month and year to calculate income (MM,yyyy): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + workerName);
        System.out.println("Departament: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ":" + String.format("%.2f",worker.income(year,month)));


    }
}