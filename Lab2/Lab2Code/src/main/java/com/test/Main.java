package com.test;

import prob2A.Student;
import prob2A.StudentFactory;
import prob2B.Order;
import prob2B.OrderLine;
import prob3.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n*********************************Problem 2A*********************************");
        System.out.println("Solved Using External Factory to generate and set objects of both classes\n");
        System.out.println("Creating Student...");
        Student student = StudentFactory.createStudent("John Doe", "A");
        System.out.println("Student Object: " + student);
        System.out.println("Grade Object: " + student.getGradeReport());

        System.out.println("\n\n*********************************Problem 2B*********************************");
        System.out.println("Solved by granting ownership of List<OrderLine> to Order\n");
        System.out.println("Creating Order...");
        Order order = new Order(LocalDate.now());
        order.setOrderLine(1, 2.0, 2.0);
        order.setOrderLine(2, 5.0, 1.0);
        order.setOrderLine(3, 10.0, 5.0);
        System.out.println("Order Object: " + order);
        System.out.println("OrderLine Objects: ");
        for (OrderLine orderLine : order.getOrderLines()) {
            System.out.println("OrderLine: " + orderLine);
        }

        System.out.println("\n\n*********************************Problem 3*********************************");
        System.out.println("Solved by adding a method in Person to generate Passport\n");
        System.out.println("Creating Person...");
        Person person = new Person("John", "Doe");
        System.out.println("Person Object before adding passport: " + person);
        System.out.println("Adding passport...");
        person.addPassport("ABC123456");
        System.out.println("Person Object after adding passport: " + person);
        System.out.println("Passport Object: " + person.getPassport());
    }
}