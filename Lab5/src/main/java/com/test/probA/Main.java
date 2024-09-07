package com.test.probA;

public class Main {
    public static void main(String[] args) {
        SingletonClass key1 = SingletonClass.getSingletonObject();
        key1.printKey();
        try {
            SingletonClass key2 = SingletonClass.getSingletonObject();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}