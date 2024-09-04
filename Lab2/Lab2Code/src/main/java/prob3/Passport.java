package prob3;

public class Passport {
    private String passportNumber;

    //    Setting access to package so that only Person Class can create Object for this
    Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
