package collections.lists.sortingLists.sortingPeople;

public class PeopleBuilder {
    private String name;
    private int age;
    private double height;

    public PeopleBuilder setHeight (double height) {
        this.height = height;
        return this;
    }
    
    public PeopleBuilder setName (java.lang.String name) {
        this.name = name;
        return this;
    }

    public PeopleBuilder setAge (int age) {
        this.age = age;
        return this;
    }

    public People creationPeople () {
        return new People(age, name, height);
    }

}
