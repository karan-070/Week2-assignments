// Define a class named Shape
public class Shape {
    // Method to set and return the name of the shape
    public String name(String n) {
        return n;
    }
    // Method to set and return the color of the shape
    public String color(String c) {
        return c;
    }

    public static void main(String[] args) {
        // Create two instances of the Shape class, shape1 and shape2
        Shape shape1 = new Shape();
        Shape shape2 = new Shape();
        // Print the description of the first shape, including its color and name
        System.out.println("First shape is a " + shape1.color("red ") + shape1.name("circle"));
        // Print the description of the second shape, including its color and name
        System.out.println("Second shape is a " + shape1.color("blue ") + shape1.name("rectangle"));
    }
}
/*public class Shape {
    private String name;
    private String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape: " + name + ", Color: " + color;
    }

    public static void main(String[] args) {
        // Create a red circle
        Shape redCircle = new Shape("Circle", "Red");

        // Create a blue rectangle
        Shape blueRectangle = new Shape("Rectangle", "Blue");

        // Display the shapes
        System.out.println(redCircle);
        System.out.println(blueRectangle);
    }
}*/
