package collections.maps.stockOfProductsWithPrice.products;

public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalValue() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', quantity=" + quantity + ", price=" + price + '}';
    }
}
