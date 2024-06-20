package collections.lists.basicsOperations.shoppingCart;

public class Item {

    private String name;

    private double price;

    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculate() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format(" name: %s price: R$ %.2f quantity: %d total: %.2f ",name,price,quantity,calculate());
    }
}
