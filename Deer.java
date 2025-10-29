import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.function.Predicate;

public class Deer {

    public static void main(String[] args) {
        
        System.out.println(test((i) -> {return i == 5;}));

    }

    private static boolean test (Predicate<Integer> p){
        return p.test(5);
    }
}

