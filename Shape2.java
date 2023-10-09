// Define a base class called Shape
class Shape2 {
    // Method to calculate and return the area of a shape
    public double calculateArea() {
        return 0.0; // Default implementation for unknown shapes
    }

    // Method to calculate and return the perimeter of a shape
    public double calculatePerimeter() {
        return 0.0; // Default implementation for unknown shapes
    }
}

// Define a class for Circle, which is a type of Shape
class Circle extends Shape2 {
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the calculateArea method for circles
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Calculate the area of a circle
    }

    // Override the calculatePerimeter method for circles
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Calculate the perimeter of a circle
    }
}

// Define a class for Rectangle, which is a type of Shape
class Rectangle extends Shape2 {
    private double length;
    private double width;

    // Constructor to initialize the length and width of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the calculateArea method for rectangles
    @Override
    public double calculateArea() {
        return length * width; // Calculate the area of a rectangle
    }

    // Override the calculatePerimeter method for rectangles
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width); // Calculate the perimeter of a rectangle
    }
}

// Define a class for Triangle, which is a type of Shape
class Triangle extends Shape2 {
    private double side1;
    private double side2;
    private double side3;

    // Constructor to initialize the sides of the triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override the calculateArea method for triangles
    @Override
    public double calculateArea() {
        // Using Heron's formula to calculate the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Override the calculatePerimeter method for triangles
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3; // Calculate the perimeter of a triangle
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Circle with radius 5
        Circle circle = new Circle(5);
        double circleArea = circle.calculateArea();
        double circlePerimeter = circle.calculatePerimeter();
        System.out.println("Circle - Area: " + circleArea + ", Perimeter: " + circlePerimeter);

        // Create a Rectangle with length 4 and width 6
        Rectangle rectangle = new Rectangle(4, 6);
        double rectangleArea = rectangle.calculateArea();
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("Rectangle - Area: " + rectangleArea + ", Perimeter: " + rectanglePerimeter);
    }
}

