package org.example.lections.lectionSecond;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class LectionSecond {
    public static void main(String[] args) {
//        String name = null;
//        System.out.println(name.length());

//        ClassCastException
//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println(file);

//        String number = "123fg";
//        int result = Integer.parseInt(number);
//        System.out.println(result);

//        List<Object> emptyListf = Collections.emptyList();
//        emptyListf.add(new Object());

//        try-catch
        int number = 1;
        try {
            number = 10 / 1;
            String test = null;
//            System.out.println(test.length());
            Collections.emptyList().add(new Object());
        }catch (ArithmeticException e){
            System.out.println("Operation divide by zero not supported!");
        }catch (NullPointerException e){
            System.out.println("Null pointer exception");
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println(number);
    }

}
