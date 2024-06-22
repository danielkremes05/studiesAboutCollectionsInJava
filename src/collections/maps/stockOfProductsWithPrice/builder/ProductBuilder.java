package collections.maps.stockOfProductsWithPrice.builder;

import collections.maps.stockOfProductsWithPrice.products.Product;

public class ProductBuilder {
    private String name;
    private int quantity;
    private double price;

    public ProductBuilder setName (String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setPrice (double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setQuantity (int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Product creationProduct () {
        return new Product(name, quantity, price);
    }
}
