package com.test.prob4;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class ConstructorReference {
    public static void main(String args[]) {
        Human[] list = {new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male")};

        // Query 1 : Print only Female candidates names
        Stream.of(list)
                .filter(h -> "Female".equals(h.getGender()))
                .map(Human::getName)
                .forEach(System.out::println);


        /*
         * Query 2 : Create an object for the Type of Human class by choosing suitable
         * Interface for the three constructors using ClassName::new.
         * Then print the object status
         */
        Function<String, Human> humanCreator1 = Human::new;
        Human human1 = humanCreator1.apply("Alice");
        System.out.println(human1);

        BiFunction<String, Integer, Human> humanCreator2 = Human::new;
        Human human2 = humanCreator2.apply("Bob", 25);
        System.out.println(human2);

        TriFunction<String, Integer, String, Human> humanCreator3 = Human::new;
        Human human3 = humanCreator3.apply("Charlie", 40, "Male");
        System.out.println(human3);


        // Query 3 : Count the male candidates whose age is more than 30
        long count = Stream.of(list)
                .filter(h -> "Male".equals(h.getGender()) && h.getAge() > 30)
                .count();
        System.out.println("Number of male candidates older than 30: " + count);

    }

}
