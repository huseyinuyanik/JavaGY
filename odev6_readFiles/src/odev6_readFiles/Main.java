package odev6_readFiles;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        MyReader myReader = new MyReader();

        ArrayList<String> kelimeler = myReader.readWords("C:\\java2022\\metinbelgesi.txt");
        String satir = myReader.readAtLine("C:\\\\java2022\\\\metinbelgesi.txt",3);

        System.out.println(kelimeler);
        System.out.println(satir);

    }
}