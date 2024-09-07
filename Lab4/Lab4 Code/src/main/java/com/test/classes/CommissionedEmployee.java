package com.test.classes;

import java.util.List;

public class CommissionedEmployee extends Employee {
    private double baseSalary;
    private double commissionRate;
    List<Order> orders;

    @Override
    double calculateGrossPay(int month, int year) {
        double grossPay = baseSalary;
        int monthValue = month - 1;
        int yearValue = year;
        if (monthValue == 0) {
            monthValue = 12;
            yearValue -= 1;
        }
        for (Order order : orders) {
            if (order.getOrderDate().getMonthValue() == monthValue && order.getOrderDate().getYear() == yearValue) {
                grossPay += (order.getOrderAmount() * commissionRate);
            }
        }
        return grossPay;
    }

    public CommissionedEmployee(String empId, double baseSalary, double commissionRate, List<Order> orders) {
        this.empId = empId;
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.orders = orders;
    }

    public CommissionedEmployee() {
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
