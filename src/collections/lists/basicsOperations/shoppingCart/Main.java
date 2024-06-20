package collections.lists.basicsOperations.shoppingCart;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", new Locale("pt", "BR"));

        String update = "Last Update: " + localDateTime.format(formatter);

        List<ShoppingCart> products = new ArrayList<>();
        products.add(new ShoppingCart("Soccer ball", 150.90, 25));
        products.add(new ShoppingCart("Computer", 2000.90, 25));
        products.add(new ShoppingCart("Iphone 11", 2500, 25));
        products.add(new ShoppingCart("SSD Hikivision ", 150.70, 25));

        System.out.println("List before remove: " + update);
        for (ShoppingCart shoppingCart : products) {
            System.out.println(shoppingCart);
        }
        System.out.println();
        System.out.println("List after remove: " + update);

        for (ShoppingCart shoppingCart : products) {
            shoppingCart.removeItem("Soccer Ball");
            System.out.println(shoppingCart);
        }

    }
}
