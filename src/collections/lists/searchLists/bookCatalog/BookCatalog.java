package collections.lists.searchLists.bookCatalog;

import java.util.ArrayList;
import java.util.List;

/**
 * The BookCatalog class manages a collection of Book objects, allowing for adding books
 * and searching for books by author, year, and title.
 */
public class BookCatalog {
    // List to store Book objects
    private List<Book> books;

    /**
     * Constructs a new BookCatalog object with an empty list of books.
     */
    public BookCatalog () {
        books = new ArrayList<>(); // Initialize empty list
    }

    /**
     * Adds a new book to the catalog.
     *
     * @param title           The title of the book
     * @param author          The author of the book
     * @param yearPublication The year the book was published
     */
    public void addBook (String title, String author, int yearPublication) {
        books.add(new Book(title, yearPublication, author)); // Add new Book object
    }

    /**
     * Searches for books by the specified author.
     *
     * @param author The author to search for
     * @return A list of books by the specified author
     */
    public List<Book> searchByAuthor (String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getNameAuthor().equalsIgnoreCase(author)) { // Case-insensitive search
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    /**
     * Searches for books published within the specified year range.
     *
     * @param yearStart The start year of the range
     * @param yearEnd   The end year of the range
     * @return A list of books published within the specified year range
     */
    public List<Book> searchByYear (int yearStart, int yearEnd) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            int yearPublished = book.getYearRelease();
            if (yearPublished >= yearStart && yearPublished <= yearEnd) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    /**
     * Searches for a book by the specified title.
     *
     * @param title The title to search for
     * @return The book with the specified title, or null if no book is found
     */
    public Book searchByTitle (String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) { // Case-insensitive search
                return book;
            }
        }
        return null; // Return null if no book found by title
    }

    /**
     * Returns all books in the catalog.
     *
     * @return A list of all books in the catalog
     */
    public List<Book> getAllBooks () {
        return books;
    }
}
