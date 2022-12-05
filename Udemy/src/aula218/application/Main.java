package aula218.application;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder  and file Path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] Files = path.listFiles(File::isFile);
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders: ");
        for(File folder : folders){
            System.out.println(folder);
        }

        System.out.println("Files: ");
        for(File file : Files){
            System.out.println(file);
        }

        boolean succes = new File(strPath + "\\subdir").mkdir();
        if (succes) System.out.println("Criado com succeço");
    }
}
