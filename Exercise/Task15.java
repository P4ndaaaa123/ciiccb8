// Shape Interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Abstract Class AbstractShape implementing Shape
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    // Constructor for AbstractShape
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Abstract methods to be implemented by concrete classes
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Circle Class extending AbstractShape
class Circle extends AbstractShape {
    double radius;

    // Constructor for Circle
    public Circle(String color, double radius) {
        super(color, 0, 0);  // Length and width are not needed for Circle
        this.radius = radius;
    }

    // Calculate area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate perimeter (circumference) of the circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle Class extending AbstractShape
class Rectangle extends AbstractShape {

    // Constructor for Rectangle
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    // Calculate area of the rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Calculate perimeter of the rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle("Red", 7);  // Circle with radius 7
        Rectangle rectangle = new Rectangle("Blue", 5, 10);  // Rectangle with length 5 and width 10

        // Display areas and perimeters
        System.out.println("Circle Details:");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        
        System.out.println("\nRectangle Details:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}


public class Task15 {

}
