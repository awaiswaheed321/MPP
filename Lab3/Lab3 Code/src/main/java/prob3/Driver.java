package prob3;

import java.util.List;

public class Driver {

    public static void main(String[] args) {
        Address[] addresses = {
                new Address("111 Main", "Fairfield", "IA", "52556"),
                new Address("200 Forest Ave", "Fairfield", "IA", "52556"),
                new Address("10 N. 4th St.", "Des Moines", "IA", "52556")
        };
        Property[] properties = {
                new House(addresses[0], 1200.0),
                new Condo(addresses[1], 2),
                new Trailer(addresses[2])
        };
        double totalRent = Admin.computeTotalRent(properties);
        System.out.println("Total rent: " + totalRent);

        List<Property> propertyList = Admin.listPropertiesOfCity(properties, "Fairfield");
        for (Property property : propertyList) {
            System.out.println("Property :" + property.getAddress());
        }
    }
}
