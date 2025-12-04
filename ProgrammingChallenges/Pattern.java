package ProgrammingChallenges;

import java.util.*;

public class Pattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Control how rows will be print
        for(int i = num; i >= 1; i--) {

            // Print number each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Move to new line after each row
            System.out.println(); 
        }

    }
}

