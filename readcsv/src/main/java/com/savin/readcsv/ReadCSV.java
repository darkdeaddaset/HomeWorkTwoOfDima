package com.savin.readcsv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    private CSVReader reader = null;

    public ReadCSV(){}

    public void read(){
        try {
            reader = new CSVReader(new FileReader("/home/q/Загрузки/a.csv"));
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null){
                for (String token : nextLine){
                    System.out.println(token);
                }
                System.out.println("\n");
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (CsvValidationException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
