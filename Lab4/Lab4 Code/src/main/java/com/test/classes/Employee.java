package com.test.classes;

import com.test.enums.TaxRates;

import java.util.EnumMap;
import java.util.Map;

public abstract class Employee {
    String empId;

    public void print(int month, int year) {
        System.out.println("Employee Id: " + this.empId);
        PayCheck payCheck = calculateCompensation(month, year);
        payCheck.print();
        System.out.println("Net Pay: " + payCheck.getNetPay());
    }

    public PayCheck calculateCompensation(int month, int year) {
        double grossPay = calculateGrossPay(month, year);
        Map<TaxRates, Double> deductions = new EnumMap<>(TaxRates.class);

        for (TaxRates taxType : TaxRates.values()) {
            deductions.put(taxType, grossPay * (taxType.getPercentage() / 100));
        }

        return new PayCheck(
                grossPay,
                deductions.get(TaxRates.FICA),
                deductions.get(TaxRates.STATE_TAX),
                deductions.get(TaxRates.LOCAL_TAX),
                deductions.get(TaxRates.MEDICARE),
                deductions.get(TaxRates.SOCIAL_SECURITY)
        );
    }

    abstract double calculateGrossPay(int month, int year);
}
