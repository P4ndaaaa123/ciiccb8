package ProgrammingChallenges;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println(" --- Multiplication Table --- ");

        for(int row = 1; row <= 10; row++){
            for(int col = 1; col <= 10; col++){
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }
    }

}
