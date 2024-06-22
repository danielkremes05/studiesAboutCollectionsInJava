package collections.maps.stockOfProductsWithPrice.main;

import collections.maps.stockOfProductsWithPrice.builder.ProductBuilder;
import collections.maps.stockOfProductsWithPrice.products.Product;
import collections.maps.stockOfProductsWithPrice.products.StockProducts;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        boolean loop = true;
        StockProducts stockProducts = new StockProducts();
        List<Product> products = new ArrayList<>();
        Long code = 1L;

        while (loop) {
            String name = JOptionPane.showInputDialog("Product name?");
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity?"));
            double price = Double.parseDouble(JOptionPane.showInputDialog("Price?"));

            Product product = new ProductBuilder()
                    .setName(name)
                    .setPrice(price)
                    .setQuantity(quantity)
                    .creationProduct();

            stockProducts.addProduct(code, product.getName(), product.getQuantity(), product.getPrice());
            products.add(product);

            String option = JOptionPane.showInputDialog("Would you like to continue (Y: yes) (N: no)?");

            if (option.equalsIgnoreCase("N")) {
                loop = false;
            }
            code++;
        }

        stockProducts.displayProducts();

        for (Product value : products) {
            String message =
                    "Name: " + value.getName()
                            + ", Price: " + value.getPrice()
                            + ", Quantity: " + value.getQuantity();
            System.out.println(message);
        }
    }
}

