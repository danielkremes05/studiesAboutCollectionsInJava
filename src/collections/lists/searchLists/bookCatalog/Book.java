package collections.lists.searchLists.bookCatalog;

import java.util.List;

/**
 * The Book class represents a book with a title, author, and year of release.
 */
public class Book {
    // A list to potentially store related Book objects (if needed in the future)
    List<Book> books;

    // The title of the book
    private String title;

    // The author of the book
    private String nameAuthor;

    // The year the book was released
    private int yearRelease;

    /**
     * Constructs a new Book object with the specified title, author, and year of release.
     *
     * @param nameAuthor  The author of the book
     * @param yearRelease The year the book was released
     * @param title       The title of the book
     */
    public Book (String nameAuthor, int yearRelease, String title) {
        this.nameAuthor = nameAuthor;
        this.yearRelease = yearRelease;
        this.title = title;
    }

    /**
     * Returns the author of the book.
     *
     * @return The author of the book
     */
    public String getNameAuthor () {
        return nameAuthor;
    }

    /**
     * Returns the title of the book.
     *
     * @return The title of the book
     */
    public String getTitle () {
        return title;
    }

    /**
     * Returns the year the book was released.
     *
     * @return The year the book was released
     */
    public int getYearRelease () {
        return yearRelease;
    }

    /**
     * Returns a string representation of the book, including the title, author, and year of release.
     *
     * @return A string representation of the book
     */
    @Override
    public String toString () {
        return "Book{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", title='" + title + '\'' +
                ", yearRelease=" + yearRelease +
                '}';
    }
}
