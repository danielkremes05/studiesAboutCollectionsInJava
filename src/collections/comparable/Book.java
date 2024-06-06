package collections.comparable;

public class Book implements Comparable<Book> {

    private String nameBook;
    private Integer year;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public int compareTo(Book other) {
        return this.nameBook.compareTo(other.nameBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", year=" + year +
                '}';
    }
}
