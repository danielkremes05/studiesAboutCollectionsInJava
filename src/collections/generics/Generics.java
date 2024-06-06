package collections.generics;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        boolean condtionLoop = true;

        while (condtionLoop) {
            String namePeople = JOptionPane.showInputDialog(null, "Enter your name or 0 to quit");
            if (namePeople != null && !namePeople.equals("0")) {
                // Proceed with the logic for a non-zero input
                System.out.println("Hello, " + namePeople + "!");
            } else {
                // Handle the case where the user wants to quit or clicked cancel
                System.out.println("Goodbye!");
                condtionLoop = false;
            }
        }
    }
}
