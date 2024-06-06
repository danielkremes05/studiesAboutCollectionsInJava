package collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> booksStore = new ArrayList<>();

        Book book1 = new Book();
        book1.setNameBook("Harry Potter");
        booksStore.add(book1);

        Book book2 = new Book();
        book2.setNameBook("Narnia");
        booksStore.add(book2);

        Book book3 = new Book();
        book3.setNameBook("O homem mais rico da Babilônia");
        booksStore.add(book3);

        Collections.sort(booksStore);

        for (Book book : booksStore) {
            System.out.println(book.getNameBook());
        }
    }
}
