package com.test.prob9;

public class Test {
    public static void main(String[] args) {
        System.out.println("\nA. Is there any Vegetarian meal available: " + Dish.menu.stream().anyMatch(Dish::isVegetarian));
        System.out.println("\nB. Is there any healthy menu have calories less than 1000: " + Dish.menu.stream().anyMatch(x -> x.getCalories() < 1000));
        System.out.println("\nC. Is there any unhealthy menu have calories greater than 1000: " + Dish.menu.stream().anyMatch(x -> x.getCalories() > 1000));
        System.out.println("\nD. first item for the type of MEAT: " + Dish.menu.stream().filter(x -> x.getType().equals(Dish.Type.MEAT)).findFirst());
        System.out.println("\nE. Total Calories: " + calculateTotalCalories());
        System.out.println("\nF. Total Calories Using Method Reference: " + calculateTotalCaloriesMethodReference());
    }

    public static int calculateTotalCalories() {
        return Dish.menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
    }

    public static int calculateTotalCaloriesMethodReference() {
        return Dish.menu.stream().mapToInt(Dish::getCalories).sum();
    }
}
