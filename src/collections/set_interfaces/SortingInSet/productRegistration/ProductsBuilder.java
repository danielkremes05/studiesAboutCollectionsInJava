package collections.set_interfaces.SortingInSet.productRegistration;

public class ProductsBuilder {
    private String name;
    private double price;
    private int code;
    private int quantity;

    public ProductsBuilder getName(String name) {
        this.name = name;
        return this;
    }

    public ProductsBuilder getPrice(double price) {
        this.price = price;
        return this;
    }

    public ProductsBuilder getCode(int code) {
        this.code = code;
        return this;
    }

    public ProductsBuilder getQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Products creationProduct() {
        return new Products(name, price, code, quantity);
    }
}
