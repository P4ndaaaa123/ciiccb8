
public class Task8 {


    public static void cumulativeSum(int... numbers) {
        int totalSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            totalSum += numbers[i];
            System.out.println("Cumulative sum up to parameter " + (i + 1) + " (" + numbers[i] + "): " + totalSum);
        }
    }
    public static void main(String[] args) {
        
        cumulativeSum(4,5,10,22);

    }
}
