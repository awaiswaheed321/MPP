package prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
    private String name;
    private List<Building> buildingList;

    public Landlord(String name) {
        this.name = name;
        this.buildingList = new ArrayList<>();
    }

    public Landlord() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Building> getBuildingList() {
        return buildingList;
    }

    public void addBuilding(Building building) {
        this.buildingList.add(building);
    }

    public Double computeProfit() {
        double totalProfit = 0.0;
        for (Building building : buildingList) {
            totalProfit += building.computeProfit();
        }
        return totalProfit;
    }
}
