package collections.comparator;

// Person class with name and age attributes
public class Person {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Override toString method to print Person objects
    @Override
    public String toString() {
        return name + " - " + age;
    }
}
