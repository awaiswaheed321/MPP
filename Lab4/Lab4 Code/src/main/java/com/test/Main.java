package com.test;

import com.test.classes.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        list.add(new Order("100", LocalDate.of(2023, 2, 1), 200));
        list.add(new Order("100", LocalDate.of(2023, 2, 10), 100));
        CommissionedEmployee cm = new CommissionedEmployee("123", 500, 0.8, list);
        Employee[] emp = {new SalariedEmployee("121", 4000), new HourlyEmployee("122", 15.67, 20), cm};
        for (Employee e : emp) {
            System.out.println("************************************************************");
            e.print(3, 2023);
        }
    }
}