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
