package ProgrammingChallenges;

import java.util.*;

public class NumberChecker {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if postive, negative or 0 number

        if (num > 0) {
            System.out.println(num + " is a positve number");
        }
        else if(num < 0){
            System.out.println(num + " is a negative number");
        }
        else{
            System.out.println(num + " is a zero");
        }

        // Check if odd or even number
        if (num % 2 == 0) {
            System.out.println(num + " is a even number");
        }
        else{
            System.out.println(num + " is a odd number");
        }
    }

}
