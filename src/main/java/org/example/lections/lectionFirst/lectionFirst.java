package org.example.lections.lectionFirst;

import java.io.File;

public class lectionFirst {
    public static void main(String[] args) {
//        System.out.println(getFileSize(new File("abc")));
//        System.out.println(divide(0, 5));
//        c();
        System.out.println(divideSecondPart(7, 0));

    }

    public static int divideSecondPart(int a, int b) {
        if ( b == 0){
            throw new RuntimeException("Divide by zero not permited");
        }
        return a / b;
    }

    public static void a(){
        b();
    }

    public static void b(){
        c();
    }

    public static void c(){
        int[] ints = new int[10];
        System.out.println(ints[200]);
    }

    public static int divide(int a1, int a2) {
        if (a2 == 0){
            return -1;
        }
        return a1/a2;
    }
    public static long getFileSize(File file){
        if(!file.exists()){
            return -1L;
        }
        return file.length();
    }
}
