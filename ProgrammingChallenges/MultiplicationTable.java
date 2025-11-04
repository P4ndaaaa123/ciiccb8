package ProgrammingChallenges;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= 10; col++){
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }
    }

}
