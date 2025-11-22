package ProgrammingChallenges;

import java.util.*;

public class CountWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to enter a sentence
        System.out.print("Enter a sentence: ");
        String words = sc.nextLine();

        // Split the string by whitespace
        String[] input = words.trim().split("\\s+");

        // Handle empty input
        int wordCount = (words.trim().isEmpty()) ? 0 : input.length;

        System.out.println("Number of words: " + wordCount);
    }
}
