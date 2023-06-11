package org.example.seminars.SeminarThree;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MiniApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество Дата_Рождения Номер_телефона пол");
        String data = scanner.nextLine();
        scanner.close();

        String[] dataSplit = data.split(" ");
        if(dataSplit.length != 6) {
            System.out.println("Введено неправильное количество данных пожалуйста повторите");
            return;
        }

        String firstName = dataSplit[0];
        String lastName = dataSplit[1];
        String middleName = dataSplit[2];
        String birthday = dataSplit[3];
        String numberPhone = dataSplit[4];
        String gender = dataSplit[5];

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(birthday);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты введите формат дд.ММ.гггг");
            return;
        }
        if(!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f")) {
            System.out.println("Вы ввели некотортный пол введите m если мужской пол f если женский");
            return;
        }

        String outputData = String.format("%s %s %s %s %s %s%n", firstName, lastName, middleName, birthday, numberPhone, gender);

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(lastName + ".txt"), StandardOpenOption.CREATE, StandardOpenOption.APPEND)){
                writer.write(outputData);
            } catch(IOException e){
                System.out.println("Произошла ошибка в записи в файл:");
                e.printStackTrace();
            }
        }
    }
