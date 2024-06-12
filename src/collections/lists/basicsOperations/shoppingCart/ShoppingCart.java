package collections.lists.basicsOperations.shoppingCart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    private String name;
    private double price;
    private int quantity;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public ShoppingCart(String name, double price, int quantity) {
        items = new ArrayList<>();
        addItem(name, price, quantity);

    }

    public void addItem(String name, double price, int quantity) {
        items.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {

        Iterator<Item> iterator = items.iterator();

        while (iterator.hasNext()) {
            Item item = iterator.next();

            if (item.getName().equalsIgnoreCase(name)) {
                iterator.remove();
            }
        }

    }

    public double calculateTotalValue() {

        double valueTotal = 0.0;

        for (Item item : items) {
            valueTotal = item.getPrice() * item.getQuantity();
        }

        return valueTotal;
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "Products " + items;
    }
}


