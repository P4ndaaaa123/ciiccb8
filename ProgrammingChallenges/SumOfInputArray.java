package ProgrammingChallenges;

import java.util.*;

public class SumOfInputArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Ask user how many times they want to input
        System.out.print("How many times the program wants to ask: ");
        int count = sc.nextInt();

        // Create an array to store the input numbers
        int[] ask = new int[count];
        int sum = 0;

        System.out.println("Enter " + count + " numbers.");

        // Loop to accept user input (index 0 to count-1)
        for (int i = 0; i < count; i++) {

            System.out.print("Enter number " + (i + 1) + " : ");
            ask[i] = sc.nextInt();  //
            sum += ask[i];  // add input to the total sum

        }

        // Compute average
        double average = (double) sum / count;

        // Display results
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}
