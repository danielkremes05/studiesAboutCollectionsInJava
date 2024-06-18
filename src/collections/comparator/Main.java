package collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list to store Person objects
        List<Person> personList = new ArrayList<>();

        // Create Person objects with name and age, then add them to the list
        Person person1 = new Person("Daniel", 24);
        Person person2 = new Person("Renato", 25);
        Person person3 = new Person("Jose", 25);

        // Add Person objects to the list
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

        // Sort the list by name using NameComparator
        Collections.sort(personList, new NameComparator());

        // Print the sorted list
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}

// Note: Ensure that the Person class is defined and includes a toString method for printing
// and that the AgeComparator and NameComparator classes are implemented properly.
