package prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Landlord landlord = new Landlord("John Doe");
        List<Building> buildings = makeBuildings(makeApartments());
        for (Building building : buildings) {
            landlord.addBuilding(building);
        }
        System.out.println("Total Profit for " + landlord.getName() + ": " + landlord.computeProfit());
    }

    private static List<Apartment> makeApartments() {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new Apartment(6000.0));
        apartments.add(new Apartment(5000.0));
        apartments.add(new Apartment(7000.0));
        apartments.add(new Apartment(2000.0));
        apartments.add(new Apartment(9000.0));
        apartments.add(new Apartment(1000.0));
        return apartments;
    }

    private static List<Building> makeBuildings(List<Apartment> apartments) {
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building("Building 1", 4000.0));
        buildings.add(new Building("Building 2", 3000.0));
        buildings.add(new Building("Building 3", 5000.0));
        for (Building building : buildings) {
            for (Apartment apartment : apartments) {
                building.addApartment(apartment);
            }
        }
        return buildings;
    }
}
