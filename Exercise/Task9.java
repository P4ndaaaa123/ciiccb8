import static java.lang.Math.*;

import java.util.Scanner;

public class Task9 {

    // 4 Basic Arithmetic Operations with Return Type
    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static float divide(int a, int b){
        return a / b;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to enter 2 numbers
        System.out.print("Enter num 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num 2: ");
        int num2 = sc.nextInt();

        // Perform the operations
        int sum = Math.addExact(num1, num2);
        int sub = Math.subtractExact(num1, num2);
        int mul = Math.multiplyExact(num1, num2);
        long div = Math.divideExact(num1, num2);


        // Display the result
        System.out.println("The Sum is " + sum);
        System.out.println("The Difference is " + sub);
        System.out.println("The Product is " + mul);
        System.out.println("The Quotient is " + div);

    }
}
