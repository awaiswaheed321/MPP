class Paycheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;
    private final double netPay;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity, double netPay) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
        this.netPay = netPay;
    }

    public void print() {
        System.out.println(" Gross Pay: " + grossPay);
        System.out.println(" Fica: " + fica);
        System.out.println(" State: " + state);
        System.out.println(" Local: " + local);
        System.out.println(" Medicare: " + medicare);
        System.out.println(" Social Security: " + socialSecurity);
        System.out.println(" NET PAY: " + netPay);
    }
}
