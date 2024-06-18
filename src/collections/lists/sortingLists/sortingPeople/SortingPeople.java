package collections.lists.sortingLists.sortingPeople;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingPeople {

    private List<People> people = new ArrayList<>();

    public void addPerson (int agePeople, String namePeople, double heightPeople) {
        people.add(new People(agePeople, namePeople, heightPeople));
    }

    public void sortByAge () {
        Collections.sort(people);
        for (People value : people) {
            System.out.println(value);
        }
    }

    public void sortByHeight () {
        people.sort(Comparator.comparingDouble(People::getHeight));
        for (People value : people) {
            System.out.println(value);
        }
    }
}