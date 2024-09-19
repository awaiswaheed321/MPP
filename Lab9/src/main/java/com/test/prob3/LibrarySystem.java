package com.test.prob3;

import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) {

        // Created libraries

        Library library1 = new Library("City Library", List.of("Origin", "Inferno", "Dune", "Foundation"));
        Library library2 = new Library("Town Library", List.of("Twilight", "Outliers"));
        Library library3 = new Library("Village Library",
                List.of("Becoming", "Leadership", "Creativity", "Sapiens", "Rebecca"));

        // Task 1. Create a list of libraries from the given three Library objects
        List<Library> libraryList = List.of(library1, library2, library3);
        System.out.println("Library List: " + libraryList);
        // Task 2: Filter libraries that have more than 3 books and print the name of the Library
        List<Library> libraries = libraryList.stream().filter(x -> x.getBooks().size() > 3).toList();
        System.out.println("Library with more than 3 books: " + libraries);
        // Task 3: FlatMap to get all the book titles from the libraries and print the results on the console
        List<String> books = libraryList.stream().flatMap(x -> x.getBooks().stream()).toList();
        System.out.println("Flat List of books: " + books);
    }
}
