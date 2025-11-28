package ProgrammingChallenges;

import java.util.*;

public class SumOfInputArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many times the program wants to ask: ");
        int count = sc.nextInt();

        int[] ask = new int[count];
        int sum = 0;

        System.out.println("Enter " + count + " numbers.");

        // Input array elements (correct indexing: 0 to count-1)
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            ask[i] = sc.nextInt();
            sum += ask[i];
        }

        // Compute average
        double average = (double) sum / count;

        // Display results
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}
