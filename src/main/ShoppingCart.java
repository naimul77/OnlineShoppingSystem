package main;

import core.Product;
import java.util.ArrayList;

public class ShoppingCart {

    private int itemCount;
    private double totalCart;

    private ArrayList<Product> products = new ArrayList<Product>() {
//        new Product(), new Product(), new Product()
//        new Product("SHO1771", "Nike SB Dunks", "Skateboarding Shoes"),
//        new Product("TSH8331", "Aloha T-Shirt", "T-Shirt"),
//        new Product("APP4061", "Apple Airpods 3", "Earpods"),
    };

    public ShoppingCart() {
        this(0, null);
    }

    public ShoppingCart(int itemCount) {
        this(itemCount, null);
    }

    public ShoppingCart(int itemCount, ArrayList<Product> products) {
        this.itemCount = itemCount;
        this.products = products;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        String returner = "Number of Items: " + this.itemCount;

        return returner;
    }

    public void add(Product product) {  // Post
        this.products.add(product);
    }

    public void remove(Product product) {   // Delete
        this.products.remove(product);
    }

    public void update(String change) {     // Put
        System.out.println("What changes would you like to make your shopping cart? ");
        System.out.println("Select: (1) Change quantity of an existing product order (2) ");
    }

    public void saveItLater() {     // Get
        // configure the session variables into a database for later access
    }

    // Represents empty cart
    public boolean iSEmpty() {
        return (itemCount == 0);
    }

    public void emptyCart() {
        while(this.itemCount-- != 0)
            products.remove(itemCount);
    }

    public double calculateBill() {
        double bill = 0.0;
        for(Product product: this.products)
            bill += ((double)(product.getQuantity()) * product.getPrice());

        return bill;
    }
}

/* Implementation of CRUD */