package ecommerce;

import java.util.Scanner;

public class ProductSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {
            "Laptop", "Smartphone", "Tablet", "Smartwatch", "Camera",
            "Headphones ", "Keyboard", "Mouse", "Monitor", "Charger"
        };

        System.out.println("Welcome to E-commerce Search!");
        System.out.println("Type the product name to search or type 'exit' to quit.");

        while (true) {
            System.out.print("\nEnter product to search: ");
            String search = scanner.nextLine();

            if (search.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            boolean found = false;
            for (String product : products) {
                if (product.equalsIgnoreCase(search)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println( search + " is available on the platform.");
            } else {
                System.out.println( search + " is NOT found in our product list.");
            }
        }

        scanner.close();
    }
}
