package com.test.probC.classes;

public class Item {
    String name;

    public String getName() {
        return name;
    }

    Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
