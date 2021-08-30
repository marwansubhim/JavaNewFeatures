package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by: Marwan on 8/29/2021 around 12:04 AM
 */
public class Less4 {

    public static void main(String[] args) {

        // Creating a function that converts a string to lower case
        Function<String, String> lowerString = String::toLowerCase;

        System.out.println("Converting this string to lower case is " + lowerString.apply("REALllLL"));

        // Creating a function that converts a string to upper case

        Function<String, String> upperString = String::toUpperCase;

        System.out.println("Converting this string to upper case is " + upperString.apply("true"));


        // Create a function that takes two lists of integers and return the even numbers in a list
        Predicate<Integer> isEven = i -> i % 2 == 0;
        Function<List<Integer>, List<Integer>> myEvenList = i -> i.stream().filter(isEven).collect(Collectors.toList());

        System.out.println("my even list is "+myEvenList.apply(new ArrayList<>(Arrays.asList(1,2,3,4,5,6))));

        // Create a function that takes two lists of integers and return the odd numbers in a list
        Function<List<Integer>, List<Integer>> myOddList = i -> i.stream().filter(isEven.negate()).collect(Collectors.toList());

        System.out.println("my odd list is "+myOddList.apply(new ArrayList<>(Arrays.asList(1,2,3,4,5,6))));

        Function<String,String> sameVal = Function.identity(); // this will return the whichever input we provide

        System.out.println(sameVal.apply("Mar"));

        Function<Integer, Integer> squareOpsBy2 = p ->{
            System.out.println("This is multiple line operation");
            int two = 2;
            return  p * p * two;
        };
        System.out.println(squareOpsBy2.apply(2));

        // Chaining the function methods using andThen() which will invoke the first operation and then execute the second operation
        squareOpsBy2 = squareOpsBy2.andThen(a ->{

            System.out.println("triple operation");

            return a * 3;
        });

        System.out.println(squareOpsBy2.apply(2));

        // Chaining the function methods using compose()

        Function<Integer,Integer> divOperation = a -> {
            System.out.println("Division by 2 operation");
            return a /2;
        };

        System.out.println("Division by 2 is "+divOperation.apply(50));
        divOperation = divOperation.compose(a ->{
            System.out.println("Division by 3 operation");
            return a /3;
        });
        System.out.println(divOperation.apply(36));

        // In the compose method the second operation will be executed first and then the first operation will be executed





    }
}
