# Studies About Collections In Java

# Comparable:
## Main
````
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

````

## Book
````
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

````

# Comparator:
## Main
````
package collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Daniel", 24);
        Person person2 = new Person("Renato", 25);
        Person person3 = new Person("Jose", 25);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        // Sort the list by age using AgeComparator
        Collections.sort(personList, new AgeComparator());

        // Print the sorted list
        for (Person person : personList) {
            System.out.println(person);
        }

        System.out.println("\n\n\n");

        // Sort the list by age using NameComparatorr
        Collections.sort(personList, new NameComparator());

        // Print the sorted list
        for (Person person : personList) {
            System.out.println(person);
        }

    }
}

````

## Person
````
package collections.comparator;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}

````

## AgeComparator
````
package collections.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}

````

## NameComparator
````
package collections.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

````

