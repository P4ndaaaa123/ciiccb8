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

        
        
        // ArrayList <Integer> arrayList = new ArrayList<>();
        
        // while (true) {

        //     System.out.print("Enter a number:");
        //     int num1 = sc.nextInt();
        //     arrayList.add(num1);
        //     System.out.print("Continue? ");
        //     String repeat = sc.next();

        //     if (repeat.equalsIgnoreCase("N") && !repeat.equalsIgnoreCase("Y")) {
        //         break;
        //     }
        // }

        // for(int x : arrayList){
        //     System.out.println(x);
        // }
        

    }
}
