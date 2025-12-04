package ProgrammingChallenges;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class NumberMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to input a number from 1 -12
        System.out.print("Enter a number from 1 - 12: ");
        int monthNumber = sc.nextInt();

        // Validate the input of the user
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Input is Out of Range");
            // Stop the program so no error happen
            return; 
        }

        // Month enum 
        Month mon = Month.of(monthNumber);

        // Get how many days in that month
        int daysInMonth = mon.length(LocalDate.now().isLeapYear());

        // Converts monthname in nice format
        String monthName = mon.name().substring(0, 1) + mon.name().substring(1).toLowerCase();
        
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println(monthNumber + " is " + monthName + ", and has " + daysInMonth + " days.");
                break;
            default:
                System.out.println("Input is Out of Range");
                break;
        }   
    }
}
