package ProgrammingChallenges;

import java.util.*;

public class SumOfAll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 5;
        int sum = 0;

        // Loop 5 times
        for(int i = 1; i <= count; i++){

            // Ask 5 times the user to enter a number
            System.out.print("Enter a number " + i + ": ");
            int num = sc.nextInt();
            sum += num;

        }

        // Print Result
        System.out.println("The Total sum is : " + sum);

    }
}
