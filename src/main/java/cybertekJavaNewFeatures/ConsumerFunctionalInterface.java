package cybertekJavaNewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Marwan on 9/1/2021 around 8:35 PM
 */
public class ConsumerFunctionalInterface {

    public static void main(String[] args) {

        Consumer<String> printThreeTimes = p -> System.out.println(p + p + p);

        printThreeTimes.accept("Marwan");

        System.out.println("*******************");

        Consumer<List<String>> printEach = p -> {
            for (String each : p) {
                System.out.print(each + " ");
            }
        };

        List<String> familyMembers = new ArrayList<>(Arrays.asList("Marwan", "Manara", "Mahdi", "Majd"));
        printEach.accept(familyMembers);
        System.out.println();

        System.out.println("_______________________________");


        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        Consumer<List<Integer>> multiplyBy2 = p -> {
            for (Integer each : p) {

                System.out.println(each * 2);

            }
        };
        multiplyBy2.accept(numbers);
        System.out.println("===========");

        numbers.forEach(p -> System.out.println(p * 5));

        System.out.println("*************");

        List<String> elements = new ArrayList<>();
        elements.addAll(Arrays.asList("java", "java", "python", "Mahdi"));

        Predicate<String> isDuplicated = p -> Collections.frequency(elements, p) > 1;
        List<String> duplicatedElements = elements.stream().filter(isDuplicated).collect(Collectors.toList());

        elements.forEach( s ->{
            if(isDuplicated.test(s))
                if(!duplicatedElements.contains(s))
                    duplicatedElements.add(s);
        } );

        System.out.println(duplicatedElements);

        System.out.println("=================");
        Consumer<int[]> printDescendingOrder = p -> {
            Arrays.sort(p);
            for (int i = p.length - 1; i >= 0; i--) {
                System.out.print(p[i] + " ");
            }

        };
        printDescendingOrder.accept(new int[]{10,54,63,28,74});
    }
}
