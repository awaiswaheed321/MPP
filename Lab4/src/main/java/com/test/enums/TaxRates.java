package com.test.enums;

public enum TaxRates {
    FICA(23.0),
    STATE_TAX(5.0),
    LOCAL_TAX(1.0),
    MEDICARE(3.0),
    SOCIAL_SECURITY(7.5);

    private final double percentage;

    TaxRates(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }
}
