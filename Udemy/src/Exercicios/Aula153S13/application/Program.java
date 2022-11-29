package Exercicios.Aula153S13.application;

import Exercicios.Aula153S13.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        System.out.println(birthDate);
        System.out.println("Enter Order Data: ");
        System.out.print("Status:");
        String orderdata = sc.next();

        Client client = new Client(name, email, birthDate);
        Order order = new Order(new Date(), OrderStatus.valueOf(orderdata),client);
        System.out.println("Client bithday:" + client.getBirthDate());
        System.out.print("how to many item to this order?: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++) {
            System.out.println("Enter " + (1 + i) + " Item Data: ");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            Product product = new Product(productName,productPrice);
            OrderItem orderItem = new OrderItem(productQuantity,productPrice,product);
            order.addItem(orderItem);
        }
        System.out.println(order);


        sc.close();
    }

}
