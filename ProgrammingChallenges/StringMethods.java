package ProgrammingChallenges;

import java.util.*;

public class StringMethods {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Ask user to input a word
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

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


        System.out.println(count);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(first);
        System.out.println(last);
        System.out.println(sub);

    }

}
