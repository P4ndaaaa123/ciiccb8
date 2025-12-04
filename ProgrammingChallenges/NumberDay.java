package ProgrammingChallenges;

import java.util.Scanner;

public class NumberDay {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Ask user to input a number from 1 to 7
        System.out.print("Enter a number from 1 - 7: ");
        int day = sc.nextInt();

        // Print the day that corresponds with input of user
        switch (day) {
            case 1:
                System.out.println(day + " is Monday");
                break;
            case 2:
                System.out.println(day + " is Tuesday");
                break;
            case 3:
                System.out.println(day + " is Wednesday");
                break;
            case 4:
                System.out.println(day + " is Thursday");
                break;
            case 5:
                System.out.println(day + " is Friday");
                break;
            case 6:
                System.out.println(day + " is Saturday");
                break;
            case 7:
                System.out.println(day + " is Sunday");
                break;
            default:
                System.out.println("Input is Out of Range");
                break;
        }
    }
}
