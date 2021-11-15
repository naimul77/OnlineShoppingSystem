package core;

public class Product {

    private String productID;
    private String productName;
    private String category;
    private int quantity; // stock
    private double price;
    private int limit;
    private double length;
    private double width;
    private double height;

    public Product() {
        this("", "", "");
    }

    public Product(String productID, String productName, String category) {
        this(productID, productName, 0, 0.0, 0);
    }

    public Product(String productID, String productName, int quantity, double price, int limit) {
        this.productID = productID;
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.limit = limit;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateShippingCost() {
        return length * width * height * 2.37;
    }

    @Override
    public String toString() {
        return "Product iD# " + this.productID + "\nProduct Name: " + this.productName + "\nStock Limit: "
                + this.limit + "\nStock: " + this.quantity + "\nPrice: " + this.price + "\nPurchase limit: " + this.limit;
    }
}
