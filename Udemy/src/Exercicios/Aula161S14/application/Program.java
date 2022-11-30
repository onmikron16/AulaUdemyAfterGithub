package Exercicios.Aula161S14.application;

import Exercicios.Aula161S14.entities.ImportedProduct;
import Exercicios.Aula161S14.entities.Product;
import Exercicios.Aula161S14.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products:");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println("Product  #" + (1+i)+  "data:");
            System.out.print("Common, used or imported (c/u/i)?: ");
            char prod = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(prod == 'i') {
                System.out.print("Customs fee: ");
                double customfee = sc.nextDouble();
                list.add(new ImportedProduct(name,price,customfee));
            } else if (prod == 'c') {
                list.add(new Product(name,price));

            }else if(prod == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufacture = sdf.parse(sc.next());
                list.add(new UsedProduct(name,price,manufacture));

            }


        }

        System.out.println("PRICES TAGS");
        for(Product p : list){
            System.out.println(p.priceTag());
        }

    }
}
