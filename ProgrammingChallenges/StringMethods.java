package ProgrammingChallenges;

import java.util.*;

public class StringMethods {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String word;
        
        // Keep asking until the user enters at least 5 characters
        while (true) {

            System.out.print("Enter a word at least 5 characters : ");
            word = sc.nextLine();

            if (word.length() >= 5) {
                break;  // Exit loop
            } else {
                System.out.println("Invalid input, Word must be at least 5 characters long.\n");
            }
        }

        // Count the lenght of the word
        int count = word.length();

        // Convert the word to uppercase and lowercase
        String upper = word.toUpperCase();
        String lower = word.toLowerCase();

        // Get the first and last letter
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);

        // Substring from 2nd to 5th character of the word 
        String sub = word.substring(1, 5);

        // Print Result
        System.out.println(count);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(first);
        System.out.println(last);
        System.out.println(sub);

    }

}
