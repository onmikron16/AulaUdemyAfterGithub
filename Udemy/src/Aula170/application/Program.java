package Aula170.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);


        method1();

        System.out.println("End  Program");

    }

    public static void method1() {
        System.out.println("*** method1 start ***");
        method2();
        System.out.println("*** method1 end ***");


    }
        public static void method2(){
        System.out.println("*** method2 start ***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid position");
            e.printStackTrace();
            sc.next();
        }catch (InputMismatchException e){
            System.out.println("input error");
        }
        System.out.println("*** method2 End ***");


    }
}

