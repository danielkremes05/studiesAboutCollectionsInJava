package collections.set_interfaces.SortingInSet.Main;

import collections.set_interfaces.SortingInSet.productRegistration.ProductCatalog;
import collections.set_interfaces.SortingInSet.productRegistration.Products;
import collections.set_interfaces.SortingInSet.productRegistration.ProductsBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<Products> productCatalogList = new ArrayList<>();

        Products products = new ProductsBuilder().getName("Daniel").getPrice(5500).getCode(400).getQuantity(5).creationProduct();
        Products products1 = new ProductsBuilder().getName("Renato").getPrice(2500).getCode(400).getQuantity(5).creationProduct();
        Products products2 = new ProductsBuilder().getName("Jose").getPrice(3500).getCode(400).getQuantity(5).creationProduct();

        ProductCatalog productCatalog = new ProductCatalog();

        productCatalog.addProduct(products.getName(), products.getPrice(), products.getCode(), products.getQuantity());
        productCatalog.addProduct(products1.getName(), products1.getPrice(), products1.getCode(), products1.getQuantity());
        productCatalog.addProduct(products2.getName(), products2.getPrice(), products2.getCode(), products2.getQuantity());

        productCatalogList.add(products2);
        productCatalogList.add(products);
        productCatalogList.add(products2);

        System.out.println("Products");
        System.out.println(products);
        System.out.println(products1);
        System.out.println(products2);
        System.out.println();

        System.out.println("List Products");

        for (Products value : productCatalogList) {
            System.out.println(value);
        }

        System.out.println();

        System.out.println("Products sorted by name:");
        productCatalog.displayProductsByName("Daniel");
        System.out.println();

        System.out.println("Products sorted by price:");
        productCatalog.displayProductByPrice();
    }
}
