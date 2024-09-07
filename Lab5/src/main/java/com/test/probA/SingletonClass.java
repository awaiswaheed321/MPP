package com.test.probA;

import java.util.UUID;

public class SingletonClass {
    private String key;
    private static SingletonClass instance = null;

    public static SingletonClass getSingletonObject() {
        if (instance == null) {
            instance = new SingletonClass(UUID.randomUUID().toString());
            return instance;
        } else {
            throw new IllegalArgumentException("Unsuccessful to produce the key");
        }
    }

    private SingletonClass(String key) {
        setKey(key);
    }

    private void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void printKey() {
        System.out.println("Key generated Successfully");
        System.out.println("Your key to activate Avast anti virus is: " + instance.getKey());
    }
}
