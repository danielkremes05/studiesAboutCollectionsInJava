package collections.lists.searchLists.bookCatalog;

import javax.swing.*;
import java.util.List;

/**
 * The Main class contains the main method to run the book catalog application,
 * allowing users to input book details via dialog boxes and interact with the BookCatalog.
 */
public class Main {
    public static void main (String[] args) {
        BookCatalog bookCatalog = new BookCatalog(); // Single instance of BookCatalog

        boolean conditions = true;

        while (conditions) {
            String title = null;
            String author = null;
            int year_converted = 0;
            try {
                // Input book details using JOptionPane
                title = JOptionPane.showInputDialog("Enter the title of the book: ");
                author = JOptionPane.showInputDialog("Enter the author of the book: ");
                String year = JOptionPane.showInputDialog("Enter the year of release: ");
                year_converted = Integer.parseInt(year); // Convert year input to integer
            } catch (Exception e) {
                // Handle any exceptions (e.g., NumberFormatException from parseInt)
                System.out.println("Error: " + e.getMessage());
            }

            // Add the book to the catalog
            bookCatalog.addBook(title, author, year_converted);

            // Prompt user to continue or quit
            String option = JOptionPane.showInputDialog("Would you like to quit? Y(yes) N(no)");

            try {
                if (option != null && option.equalsIgnoreCase("Y")) {
                    conditions = false; // Set conditions to false to exit the loop
                }
            } catch (Exception e) {
                // Handle any exceptions (e.g., NullPointerException from option being null)
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Example: Print all books added to the catalog
        List<Book> allBooks = bookCatalog.getAllBooks();
        for (Book book : allBooks) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getNameAuthor() + ", Year: " + book.getYearRelease());
        }
    }
}
