package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by: Marwan on 8/28/2021 around 11:22 PM
 */
public class Less3 {

    public static void main(String[] args) {

        // Creating a predicate
        Predicate<Integer> isEven = i -> i % 2 == 0;

        // Calling the predicate method
        System.out.println("The number in this example is even?  answer is: "+isEven.test(50));

        //Creating another predicate

        Predicate<Integer> isGreaterThan50 = p -> p > 50;

        // Calling the method and testing it
        System.out.println("The number in this example is greater then 50?  answer is: "+isGreaterThan50.test(5));

        // Predicate AND chaining
        System.out.println(
                "The number in this example is greater then 50 AND is even?  answers are: "+isGreaterThan50.and(isEven).test(20));

        // Predicate OR chaining
        System.out.println(
                "The number in this example is greater then 50 OR is even?  answers are: "+isGreaterThan50.or(isEven).test(30));

        // Predicate NOT operator
        System.out.println("This number is odd number? answer is: "+isEven.negate().test(21));

        // Predicate negate chaining

        System.out.println("This number is not an even number and not greater then 50? answer is: "+isGreaterThan50.negate().and(isEven.negate()).test(31));

        // Usage of predicate inside Collections & Streams

        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        // Get all the even numbers from myList and store them inside an evens list
        List<Integer> evens = myList.stream().filter(isEven).collect(Collectors.toList());

        // Get all the odd numbers from myList and store them inside an odds list
        List<Integer> odds = myList.stream().filter(isEven.negate()).collect(Collectors.toList());

        // Print the result
        System.out.println(myList);
        System.out.println(evens);
        System.out.println(odds);

        Predicate<String> myName = Predicate.isEqual("MARWAN");

        System.out.println("My name matches this name? "+myName.test("marwan".toUpperCase()));

    }

}
