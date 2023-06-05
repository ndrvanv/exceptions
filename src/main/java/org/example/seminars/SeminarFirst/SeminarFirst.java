package org.example.seminars.SeminarFirst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SeminarFirst {
    public static void main(String[] args) {
//        divideInt(8, 0);
//        array();
//        divideNumbers(4, 0);
        int[] arrayOne = {8, 5, 9};
        int[] arrayTwo = {2, 3, 7};
        int[] diff = array(arrayOne, arrayTwo);
        if(diff != null) {
            System.out.println(Arrays.toString(diff));
        }
    }
//    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static int divideInt(int a, int b) {
        return a / b;
    }
    public static int divideNumbers(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        return a / b;
    }
    public static void array() {
        int[] array = new int[10];
        System.out.println(array[200]);
    }

//    Метод чтения файла которого может не существовать
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.hasNextLine());
        }
        scanner.close();
    }

    /*
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен разности элементов
    двух входящих массивов в той же ячейке. Если длины массивов не равны,
    необходимо как-то оповестить пользователя.
     */
    public static int[] array(int[] arrayIntFirst, int[] arrayIntSecond){
        if(arrayIntFirst.length != arrayIntSecond.length) {
            System.out.println("array lengths are not equal");
            return null;
        }
        int[] result = new int[arrayIntFirst.length];
        for (int i = 0; i < arrayIntFirst.length; i++){
            result[i] = arrayIntFirst[i] - arrayIntSecond[i];
        }
        return result;

    }
}