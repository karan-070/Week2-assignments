// Define an abstract class called Shapes
abstract class Shapes {
    // Declare abstract methods for calculating area and perimeter
    abstract double calculateArea();

    abstract double calculatePerimeter();
}

// Define a class Circle that extends the Shapes abstract class
class Circle extends Shapes {
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the calculateArea method for circles
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    // Implement the calculatePerimeter method for circles
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

// Define a class Rectangle that extends the Shapes abstract class
class Rectangle extends Shapes {
    private double length;
    private double breadth;

    // Constructor to initialize the length and breadth of the rectangle
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Implement the calculateArea method for rectangles
    public double calculateArea() {
        return length * breadth;
    }

    // Implement the calculatePerimeter method for rectangles
    public double calculatePerimeter() {
        return (2 * length) + (2 * breadth);
    }

}

// Define a class Triangle that extends the Shapes abstract class
class Triangle extends Shapes {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implement the calculateArea method for triangles
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Implement the calculatePerimeter method for triangles
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

class Main {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        // Display the area and perimeter of the circle
        System.out.println("Area of circle " + circle.calculateArea() + " and perimeter is " + circle.calculatePerimeter());
        // Display the area and perimeter of the rectangle
        System.out.println("Area of rectangle " + rectangle.calculateArea() + " and perimeter is " + rectangle.calculatePerimeter());
    }

}
