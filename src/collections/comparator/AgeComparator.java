package collections.comparator;

import java.util.Comparator;

// Comparator for sorting Person objects by age
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
