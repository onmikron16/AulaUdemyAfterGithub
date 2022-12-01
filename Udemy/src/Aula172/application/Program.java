package Aula172.application;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\onmikron\\Documents\\text.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("finally executado");
        }
    }
}



