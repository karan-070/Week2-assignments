package ecommerce;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters for name and price

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
