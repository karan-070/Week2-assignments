package ecommerce;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    // Getters and setters for name

    @Override
    public String toString() {
        return name;
    }
}
