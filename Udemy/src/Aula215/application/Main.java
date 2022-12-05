package Aula215.application;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String path = "C:\\Users\\onmikron\\Documents\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
