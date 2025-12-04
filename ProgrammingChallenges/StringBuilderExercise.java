package ProgrammingChallenges;

import java.util.*;

public class StringBuilderExercise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String input;
        
        // Ask user repeatedly until they enter at least 10 characters
        while (true) {

            System.out.print("Enter at least 10 characters: ");
            input = sc.nextLine();

            if (input.length() >= 10) break; // If valid input

            System.out.println("Please try again.\n");
        }

        // Create StringBuilder using the user's input
        StringBuilder sbuild = new StringBuilder(input);

        // Print the length of the String
        System.out.println("Length: " + sbuild.length());

        // Print the first character
        System.out.println("First character: " + sbuild.charAt(0));

        // Print the last character
        System.out.println("Last character: " + sbuild.charAt(sbuild.length() - 1));

        // Print the Index of first occurrence of 'a'
        System.out.println("First index of 'a': " + sbuild.indexOf("a"));

        // Print the Substring from index 3 to 6
        System.out.println("Substring (3 to 6): " + sbuild.substring(3, 6));

        // Append "123" to the end
        sbuild.append("123");
        System.out.println("Append 123 to the end: " + sbuild);

        // Insert "xyz" at index 4
        sbuild.insert(4, "xyz");
        System.out.println("Insert xyz at index 4: " + sbuild);

        // Delete substring from index 2 to 4
        sbuild.delete(2, 4);
        System.out.println("Delete index 2 to 4: " + sbuild);

        // Delete character at index 8
        sbuild.deleteCharAt(8);
        System.out.println("Deletea char at index 8: " + sbuild);

        // Reverse and print
        sbuild.reverse();
        System.out.println("Reversed string: " + sbuild);

    }
}
