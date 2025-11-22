package ProgrammingChallenges;

import java.util.*;

public class SumOfAll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 5;
        int sum = 0;

        for(int i = 1; i<=count; i++){

            System.out.print("Enter a number " + i + ": ");
            int num = sc.nextInt();
            sum += num;

        }

        System.out.println("The Total sum is " + sum);

    }
}
