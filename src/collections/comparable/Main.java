package collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list to store Book objects
        List<Book> booksStore = new ArrayList<>();

        // Create a Book object and set its name, then add it to the list
        Book book1 = new Book();
        book1.setNameBook("Harry Potter");
        booksStore.add(book1);

        // Create another Book object and set its name, then add it to the list
        Book book2 = new Book();
        book2.setNameBook("Narnia");
        booksStore.add(book2);

        // Create yet another Book object and set its name, then add it to the list
        Book book3 = new Book();
        book3.setNameBook("O homem mais rico da Babilônia");
        booksStore.add(book3);

        // Sort the list of books in natural order (must implement Comparable interface in Book class)
        Collections.sort(booksStore);

        // Iterate over the sorted list and print the name of each book
        for (Book book : booksStore) {
            System.out.println(book.getNameBook());
        }
    }
}

// Note: The Book class should implement the Comparable interface and provide
// an implementation for the compareTo method to define the natural ordering of books.
