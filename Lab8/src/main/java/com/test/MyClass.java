package com.test;

import java.util.function.Predicate;

public class MyClass {
    int x;
    String y;

    public MyClass(int x, String y) {
        this.x = x;
        this.y = y;
    }

    // testing method to check the equality, write a lambda to do this
    public void myMethod(MyClass cl) {
        if (myCompare(cl::equals)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null)
            return false;
        if (ob.getClass() != getClass())
            return false;
        MyClass mc = (MyClass) ob;
        return mc.x == x && mc.y.equals(y);
    }

    public boolean myCompare(Predicate<Object> c) {
        return c.test(this);
    }

    public static void main(String[] args) {
        MyClass myclass = new MyClass(1, "A");
        MyClass myclass1 = new MyClass(1, "B");
        myclass.myMethod(myclass); // print true
        myclass.myMethod(myclass1); // print false
    }
}