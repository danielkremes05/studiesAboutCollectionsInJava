package collections.comparable;

public class Book implements Comparable<Book> {
    private String nameBook;

    // Getter for nameBook
    public String getNameBook() {
        return nameBook;
    }

    // Setter for nameBook
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    // Override the compareTo method to define the natural ordering of Book objects
    @Override
    public int compareTo(Book other) {
        return this.nameBook.compareTo(other.nameBook);
    }
}
