public class Task8 {

    public static void cumulativeSum(int... numbers) {

        int totalSum = 0;

        // Compute total of all parameters
        for (int n : numbers) {
            totalSum += n; 

            int cumulative = 0;
        
            // Compute the sum per parameter
            for (int i = 1; i <= n; i++) {
                cumulative += i;
            }

            // Print the result
            System.out.println("Cumulative Sum of " + n + ": " + cumulative);
        }

        System.out.println("Total Sum of all Parameters: " + totalSum);
    }

    public static void main(String[] args) {

        cumulativeSum(4, 5, 10, 17);
    }
}

