// Define an interface named Drawable
interface Drawable {
    // Declare an abstract method named draw, which must be implemented by classes that implement this interface
    void draw();
}
// Define a class Circle that implements the Drawable interface
class Circle implements Drawable {
    private int radius;
    // Constructor to initialize the radius of the circle
    public Circle(int radius) {
        this.radius = radius;
    }
    // Implement the draw method to specify how to draw a circle
    public void draw() {
        System.out.println("Drawing a Circle with radius = " + radius);
    }
}
// Define a class Rectangle that implements the Drawable interface
class Rectangle implements Drawable {
    private int length;
    private int breadth;
    // Constructor to initialize the length and breadth of the rectangle
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // Implement the draw method to specify how to draw a rectangle
    public void draw() {
        System.out.println("Drawing a Recatangle with length = " + length + " and breadth = " + breadth);
    }
}
// Define a class Triangle that implements the Drawable interface
class Triangle implements Drawable {
    private int side1;
    private int side2;
    private int side3;
    // Constructor to initialize the sides of the triangle
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // Implement the draw method to specify how to draw a triangle
    public void draw() {
        System.out.println("Drawing a Triangle with side1 = " + side1 + " , side2 = " + side2 + " and side3 = " + side3);
    }
}

class Main {
    public static void main(String[] args) {
        // Create instances of Circle, Rectangle, and Triangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);
        // Call the draw method on each shape to demonstrate drawing
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}