package collections.lists.sortingLists.sortingPeople;

public class People implements Comparable<People> {
    private String name;
    private int age;
    private double height;

    public People (int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public int getAge () {
        return age;
    }

    public double getHeight () {
        return height;
    }

    public String getName () {
        return name;
    }

    @Override
    public int compareTo (People age) {
        return Integer.compare(this.age, age.getAge());
    }

    @Override
    public String toString () {
        return "People " +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height;
    }

}
