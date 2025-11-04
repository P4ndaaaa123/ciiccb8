package ProgrammingChallenges;

import java.util.Scanner;

public class ScoreGrade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your grade: ");
        int grade = scan.nextInt();

        if (grade >= 90) {
            System.out.println(name + ", Grade : A");
        }
        else if (grade >= 80 && grade <= 89) {
            System.out.println(name + ", Grade : B");
        }
        else if (grade >= 70 && grade <= 79) {
            System.out.println(name + ", Grade : C");
        }
        else if (grade >= 60 && grade <= 69) {
            System.out.println(name + ", Grade : D");
        }
        else
        {
            System.out.println(name + ", Grade : F");
        }
  
    }

}
