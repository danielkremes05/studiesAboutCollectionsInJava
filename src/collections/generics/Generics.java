package collections.generics;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        // Create a list to store names
        List<String> names = new ArrayList<>();
        // Condition to control the loop
        boolean conditionLoop = true;

        while (conditionLoop) {
            // Show input dialog and get the user's input
            String namePeople = JOptionPane.showInputDialog(null, "Enter your name or 0 to quit");

            // Check if the user input is not null and not "0"
            if (namePeople != null && !namePeople.equals("0")) {
                // Add the name to the list
                names.add(namePeople);
                // Print a greeting message to the console
                System.out.println("Hello, " + namePeople + "!");
            } else {
                // If the input is "0" or the user clicked cancel, exit the loop
                System.out.println("Goodbye!");
                conditionLoop = false;
            }
        }

        // Optional: Print all collected names
        System.out.println("Names entered: " + names);
    }
}
