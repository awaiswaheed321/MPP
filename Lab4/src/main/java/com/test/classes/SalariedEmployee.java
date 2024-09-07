package com.test.classes;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    public SalariedEmployee() {
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    double calculateGrossPay(int month, int year) {
        return this.getSalary();
    }
}
