package com.test.classes;

import com.test.enums.TaxRates;

public class PayCheck {
    private final double grossPay;
    private final double fica;
    private final double stateTax;
    private final double localTax;
    private final double medicare;
    private final double socialSecurity;

    public PayCheck(double grossPay, double fica, double stateTax, double localTax, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.stateTax = stateTax;
        this.localTax = localTax;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    public void print() {
        System.out.println(this);
    }

    public double getNetPay() {
        return grossPay - (fica + stateTax + localTax + medicare + socialSecurity);
    }

    @Override
    public String toString() {
        return "PayCheck{" +
                "\ngrossPay=" + grossPay +
                "\nfica rate=" + TaxRates.FICA.getPercentage() + "%, fica deduction: " + fica +
                "\nstateTax rate=" + TaxRates.STATE_TAX.getPercentage() + "%, stateTax deduction: " + stateTax +
                "\nlocalTax rate=" + TaxRates.LOCAL_TAX.getPercentage() + "%, localTax deduction: " + localTax +
                "\nmedicare rate=" + TaxRates.MEDICARE.getPercentage() + "%, medicare deduction: " + medicare +
                "\nsocialSecurity rate=" + TaxRates.SOCIAL_SECURITY.getPercentage() + "%, socialSecurity deduction: " + socialSecurity +
                '}';
    }
}
