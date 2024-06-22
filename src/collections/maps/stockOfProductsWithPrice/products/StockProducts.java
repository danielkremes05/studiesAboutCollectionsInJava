package collections.maps.stockOfProductsWithPrice.products;

import java.util.HashMap;
import java.util.Map;

public class StockProducts {
    private Map<Long, Product> products = new HashMap<>();

    public void addProduct (long cod, String name, int quantity, double price) {
        products.put(cod, new Product(name, quantity, price));
    }

    public void displayProducts () {
        products.forEach((cod, product) -> System.out.println("Code: " + cod + ", " + product));
    }

    public double calculateTotalStockValue () {
        return products.values().stream().mapToDouble(Product::getTotalValue).sum();
    }

    public Product getMostExpensiveProduct () {
        return products.values().stream().max((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice())).orElse(null);
    }

    public Product obterProductMostExpensive () {
        return products.values().stream().min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice())).orElse(null);
    }

    public Product obtainMostQuantityProductTotalValueInStock () {
        return products.values().stream().max((p1, p2) -> Double.compare(p1.getTotalValue(), p2.getTotalValue())).orElse(null);
    }
}
