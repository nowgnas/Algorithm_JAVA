package com.company;


public class Main {

    public static void main(String[] args) {
        ObjectOne one = new ObjectOne();
        one.number = 99;
        one.method(100);
        System.out.println(one.number);
    }
}

class ObjectOne {
    public int number;

    public void method(int n) {
        number = n;
    }
}