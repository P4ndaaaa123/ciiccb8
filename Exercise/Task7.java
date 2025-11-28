import java.util.*;

public class Task7 {

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num 2: ");
        int num2 = sc.nextInt();

        int result1 = add(num1, num2);
        int result2 = subtract(num1, num2);
        int result3 = multiply(num1, num2);
        int result4 = divide(num1, num2);

        System.out.println("The Sum is " + result1);
        System.out.println("The Difference is " + result2);
        System.out.println("The Product is " + result3);
        System.out.println("The Quotient is " + result4);

    }

}
