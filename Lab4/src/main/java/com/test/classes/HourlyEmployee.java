package com.test.classes;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursPerWeek;

    @Override
    double calculateGrossPay(int month, int year) {
        return this.getHourlyRate() * this.getHoursPerWeek() * 4;
    }

    public HourlyEmployee(String empId, double hourlyRate, double hoursPerWeek) {
        this.empId = empId;
        this.hourlyRate = hourlyRate;
        this.hoursPerWeek = hoursPerWeek;
    }

    public HourlyEmployee() {
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }


}
