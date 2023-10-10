package ecommerce;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> orderedProducts;
    private Date orderDate;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderedProducts = new ArrayList<>();
        this.orderDate = new Date(); // Current date and time
    }

    public void addProductToOrder(Product product) {
        orderedProducts.add(product);
    }

    // Getters and setters for orderId, customer, and orderDate

    @Override
    public String toString() {
        return "Order ID: " + orderId +
                "\nCustomer: " + customer +
                "\nOrder Date: " + orderDate +
                "\nOrdered Products: " + orderedProducts;
    }
}
