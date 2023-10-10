package ecommerce;

public class Main {
    public static void main(String[] args) {
        // Create a Product
        Product productA = new Product("Product A", 100.0);

        // Create a Customer
        Customer johnDoe = new Customer("John Doe");

        // Create an Order for Customer John Doe
        Order order = new Order(1, johnDoe);
        order.addProductToOrder(productA);

        // Create a ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToCart(productA);

        // Print example instances
        System.out.println("Product: " + productA);
        System.out.println("Customer: " + johnDoe);
        System.out.println("Order:\n" + order);
        System.out.println("Shopping Cart:\n" + shoppingCart);
    }
}
