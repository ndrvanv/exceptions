package org.example.lections.lectionThree;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LectionThree {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("C:\\Users\\1311103\\OneDrive\\Рабочий стол\\GB\\exceptions\\src\\main\\java\\org\\example\\lections\\lectionThree");
            FileWriter writer = new FileWriter("test")){
            while (reader.ready()){
                writer.write(reader.read());
            }
        }catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy successful");
    }
}
