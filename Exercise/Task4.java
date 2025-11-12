import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in); 

    System.out.print("Enter a word or number: ");
    String input = sc.nextLine();

    StringBuilder sbuild = new StringBuilder(input);
    sbuild.reverse(); 

    System.out.println(input.equals(sbuild.toString()) ? "The Input is a Palindrome" : "The Input is not a Palindrome");

    }
}
