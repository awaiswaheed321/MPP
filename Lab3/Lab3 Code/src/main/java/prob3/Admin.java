package prob3;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Property> listPropertiesOfCity(Property[] properties, String city) {
		List<Property> cityProps = new ArrayList<>();
		for (Property property : properties) {
			if (property.getAddress().getCity().equals(city)) {
				cityProps.add(property);
			}
		}
		return cityProps;
	}

	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property o : properties) {
			totalRent += o.computeRent();
		}
		return totalRent;
	}
}
