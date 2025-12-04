class Vehicle{

    String make;
    String model;
    int year;

    // Constructor for Vehicle 
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

}

class Car extends Vehicle{

    int numberOfDoors;

    // Constructor for Car class
    public Car(String make, String model, int year, int numberOfDoors) {
        // Call the parent class constructor
        super(make, model, year);  
        this.numberOfDoors = numberOfDoors;
    }

    // Display details of the car
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }

}

public class Task13 {

    public static void main(String[] args) {

        // Instantiate Car
        Car myCar = new Car("Toyota", "Camry", 2001, 4);

        myCar.displayDetails();
        
    }

}
