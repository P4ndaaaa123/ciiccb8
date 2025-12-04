package ProgrammingChallenges;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println(" --- Multiplication Table 10x10 --- ");

        // Handle row
        for(int row = 1; row <= 10; row++){

            // Handle column
            for(int col = 1; col <= 10; col++){

                // Multiply row and column, print with tab spacing
                System.out.print((row * col) + "\t");
            }

            // Move to new line
            System.out.println();
        }
    }
}