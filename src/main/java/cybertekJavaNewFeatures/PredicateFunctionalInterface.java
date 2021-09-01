package cybertekJavaNewFeatures;

import java.util.function.Predicate;

/**
 * Created by Marwan on 9/1/2021 around 7:53 PM
 */
public class PredicateFunctionalInterface {

    public static void main(String[] args) {

        Predicate<Integer> isEven = a -> a % 2 == 0;

        System.out.println(isEven.test(41));
    }
}
