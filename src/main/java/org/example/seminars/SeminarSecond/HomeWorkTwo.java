package org.example.seminars.SeminarSecond;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) throws Exception {
//        float userInput = aFloat();
//        System.out.println("Вы ввели число: "+ userInput);
//        exTwo();
//        exFour();
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }  catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws Exception {
        System.out.println(a + b);
    }

//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void exFour() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = string.trim();
        if(string.isEmpty()){
            throw new IllegalArgumentException("Строка пустая!");
        } else {
            System.out.println(string);
        }
    }


//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
//    приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static float aFloat(){
        Scanner scanner = new Scanner(System.in);
        float userInput;
        while (true) {
            System.out.println("Введите дробоное число float: ");
            try {
                userInput = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! введен не другой формат, попробуйте еще раз! ");
            }
        }
        return userInput;
    }
    public static void exTwo() {
        try {
            int d = 0;
            int[] intArray = new int[8];
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array Index Out Of Bounds Exception ");
        }
    }
}
