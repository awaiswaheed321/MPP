abstract class Employee {
    String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    abstract double calcGrossPay(int month, int year);

    public Paycheck calcCompensation(int month, int year) {
        double grossPay = calcGrossPay(month, year);

        double fica = grossPay * 0.23;
        double state = grossPay * 0.05;
        double local = grossPay * 0.01;
        double medicare = grossPay * 0.03;
        double socialSecurity = grossPay * 0.075;

        double netPay = grossPay - (fica + state + local + medicare + socialSecurity);

        return new Paycheck(grossPay, fica, state, local, medicare, socialSecurity, netPay);
    }

    public void print(int month, int year) {
        System.out.println("Employee Id : " + empId);
        System.out.println("Paystub:");
        Paycheck paycheck = calcCompensation(month, year);
        paycheck.print();
    }
}
