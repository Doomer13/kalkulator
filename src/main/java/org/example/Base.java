package org.example;

public class Base {

    public  int summ (int a, int b){

        int result;
        result = a+b;
        System.out.println("Сложение: " + a + " и " + b + " =" + result);
        return result;
    }

    public  int minus ( int a, int b) {
        int result;
        result = a-b;
        System.out.println("Вычетание: "  +  a + " и " + b + " =" + result);
        return result;
    }
}
