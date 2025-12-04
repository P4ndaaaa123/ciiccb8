package ProgrammingChallenges;

import java.util.Scanner;

public class ScoreGrade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Ask user to input name and grade
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your grade: ");
        int grade = scan.nextInt();

        // Check grade based on condition
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade. Please enter a value between 0 and 100.");
        }
        else if (grade >= 90) {
            System.out.println(name + ", Grade : A");
        }
        else if (grade >= 80) {
            System.out.println(name + ", Grade : B");
        }
        else if (grade >= 70) {
            System.out.println(name + ", Grade : C");
        }
        else if (grade >= 60) {
            System.out.println(name + ", Grade : D");
        }
        else {
            System.out.println(name + ", Grade : F");
        }
  
    }

}
