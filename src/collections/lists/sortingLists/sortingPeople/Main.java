package collections.lists.sortingLists.sortingPeople;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {

        List<People> peopleStore = new ArrayList<>();
        SortingPeople sortingPeople = new SortingPeople();

        People people = new PeopleBuilder()
                .setName("Daniel")
                .setAge(24)
                .setHeight(1.69)
                .creationPeople();

        People people1 = new PeopleBuilder()
                .setName("Renato")
                .setAge(25)
                .setHeight(1.89)
                .creationPeople();

        peopleStore.add(people);
        peopleStore.add(people1);

        System.out.println("By age !");
        sortingPeople.addPerson(people.getAge(), people1.getName(), people1.getHeight());
        sortingPeople.addPerson(people.getAge(), people.getName(), people.getHeight());
        sortingPeople.sortByAge();
        System.out.println();

        System.out.println("By height !");
        sortingPeople.sortByHeight();
    }
}
