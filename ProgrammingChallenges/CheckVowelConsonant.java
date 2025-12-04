package ProgrammingChallenges;

import java.util.*;

public class CheckVowelConsonant {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Ask user to enter a letter
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);

        if (isVowel(letter)) {  // Check if the character is a vowel
            System.out.println(letter + " is a vowel.");
        }
        else if(isConsonant(letter)){   // Check if the character is a consonant
            System.out.println(letter + " is a consonant");
        }
        else {  // If it's not a vowel or consonant, it's invalid
            System.out.println(letter + " is not a valid letter.");
        }

    }

    // Method to check if the character is a vowel
    public static boolean isVowel(char letter) {

        // Check if the letter is a vowel (both lowercase and uppercase)
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};

        // Check if the letter is in the vowels array
        for (char vowel : vowels) {
            if (letter == vowel) {
                return true;  // If it matches any vowel, return true
            }
    }
        return false;  // If no match is found, return false
    }

    public static boolean isConsonant(char letter){

        // Check if the letter is an alphabetic character and not a vowel
        return Character.isLetter(letter) && !isVowel(letter);

    }

}

