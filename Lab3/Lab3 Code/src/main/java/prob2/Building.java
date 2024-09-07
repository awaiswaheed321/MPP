package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String name;
    private double maintenanceCost;
    private List<Apartment> apartmentList;

    public Building(String name, double maintenanceCost) {
        this.name = name;
        this.maintenanceCost = maintenanceCost;
        this.apartmentList = new ArrayList<>();
    }

    public Building() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public List<Apartment> getApartmentList() {
        return apartmentList;
    }

    public void addApartment(Apartment apartment) {
        this.apartmentList.add(apartment);
    }

    public Double computeProfit() {
        double totalRent = 0.0;
        for (Apartment apartment : apartmentList) {
            totalRent += apartment.getRent();
        }
        return totalRent - maintenanceCost;
    }
}
