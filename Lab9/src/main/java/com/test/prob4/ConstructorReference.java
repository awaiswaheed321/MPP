package com.test.prob4;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

class Human {
    String name;
    int age;
    String gender;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}

public class ConstructorReference {
    public static void main(String args[]) {
        Human[] list = {new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male")};

        // Query 1  : Print only Female candidates names
        System.out.println("Query 1\nFemales: ");
        Arrays.stream(list)
                .filter(s -> s.getGender().equals("Female"))
                .forEach(System.out::println);

    /* Query 2 : Create an object for the Type of Human class by choosing suitable Interface for the three  constructors using ClassName::new. 
                 Then print the object status */
        TriFunction<String, Integer, String, Human> objCreator1 = Human::new;
        BiFunction<String, Integer, Human> objCreator2 = Human::new;
        Function<String, Human> objCreator3 = Human::new;

        System.out.println("\nQuery 2:");
        System.out.println(objCreator1.apply("Sandra", 20, "Female"));
        System.out.println(objCreator2.apply("John", 25));
        System.out.println(objCreator3.apply("Tim"));

        System.out.println("\nQuery 3:");
        // Query 3 : Count the male candidates whose age is more than 30
        System.out.println("Count of Males above age 30 years: " + Arrays.stream(list).filter(s -> s.getGender().equals("Male")).filter(s -> s.getAge() > 30).count());

    }


}
