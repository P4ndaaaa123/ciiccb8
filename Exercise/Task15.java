// Shape Interface
interface Shape {

    double calculateArea();
    double calculatePerimeter();

}

// AbstractShape implementing Shape
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

    // Abstract methods to be implemented
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

}

// Circle Class extending AbstractShape
class Circle extends AbstractShape {

    double radius;

    // Constructor for Circle
    public Circle(String color, double radius) {
        super(color, 0, 0); 
        this.radius = radius;
    }

    // Calculate area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate circumference of the circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle Class extends AbstractShape
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


public class Task15 {
    public static void main(String[] args) {

        // Create instance for Circle and Rectangle
        Circle circle = new Circle("Red", 6); 
        Rectangle rectangle = new Rectangle("Blue", 5, 9); 

        // Print Result
        System.out.println("Circle Details:");
        System.out.println("Color: " + circle.color);
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", circle.calculatePerimeter());
        
        System.out.println("\nRectangle Details:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

    }
}
