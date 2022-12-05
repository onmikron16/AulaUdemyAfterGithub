package Aula217.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String[] lines = new String[]{
                "good morning", "good nigger" , "good boy"
        };

        String path = "C:\\Users\\onmikron\\Documents\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){

            for(String line : lines){
               bw.write(line);
               bw.newLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
