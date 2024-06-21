package collections.set_interfaces.SortingInSet.productRegistration;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductCatalog {

    Set<Products> products = new HashSet<>();

    public void addProduct(String name, double price, int code, int quantity) {
        products.add(new Products(name, price, code, quantity));
    }

    public void displayProductsByName(String name) {

        Set<Products> sortedByName = new TreeSet<>(Comparator.comparing(Products::getName));
        sortedByName.addAll(products);

        for (Products product : sortedByName) {
            System.out.println(product);
        }
    }

    public void displayProductByPrice() {
        Set<Products> sortedByPrice = new TreeSet<>(Comparator.comparingDouble(Products::getPrice));
        sortedByPrice.addAll(products);

        for (Products product : sortedByPrice) {
            System.out.println(product);
        }
    }
}
