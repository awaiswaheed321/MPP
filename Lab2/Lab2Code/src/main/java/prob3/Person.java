package prob3;

public class Person {
    private Passport passport;
    private String fName;
    private String lName;

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public Passport getPassport() {
        return passport;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void addPassport(String passportNumber) {
        if (this.passport == null) {
            passport = new Passport(passportNumber);
        } else {
            throw new IllegalArgumentException("Person Already has a Passport.");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "passport=" + passport +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
