package prob3;

public abstract class Property {
    private final Address address;

    public Property(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public abstract double computeRent();
}
