package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import core.Product;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello! Welcome to the Online Shopping Application!");

        Product table = new Product();
        table.setProductName("Coffee Table");

        System.out.println("\nChoose an action: (1) Buy (2) Sell (3)");
        System.out.print("Enter your choice: ");
        int choice = 0;
        while(true) {
            try {
                choice = input.nextInt();

                switch(choice) {
                    case 1:
                        System.out.println("Which Products would you like to purchase? ");
                        break;

                    case 2:
                        System.out.println("Select a product category to sell any of your items for sale. ");
                        System.out.println("Select: (1) Apparel (2) Tech Gadgets (3) Furniture (4) ");

                        break;

                    default: System.out.println("Sorry! Your choice of input is invalid. Please try again. ");
                }

                break;

            } catch(InputMismatchException imex) {
                System.out.println("\nYour choice is invalid. Input must be a single-digit integer between 1 and 3. ");
                System.out.println("Please enter your choice (1, 2, 3): ");
            } finally {
                System.out.println("Thank you for running this program. ");
            }
        }
    }
}
