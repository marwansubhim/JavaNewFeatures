package cybertekJavaNewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Marwan on 9/2/2021 around 8:35 PM
 */
public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        Stream<Integer> stream = list.stream();

        //stream.map(a -> a * 2).forEach(System.out::println);
        System.out.println("-------");
        List<Integer> newList = stream.map(a -> a * 3).collect(Collectors.toList());

        System.out.println(newList);
        System.out.println("************");

        Stream<Integer> stream1 = newList.stream();

        newList = stream1.map(a -> {
            if (a % 2 == 1) return a + 5;
            else return a;
        }).collect(Collectors.toList());

        System.out.println(newList);

        System.out.println("-----------------");

        List<Integer> divisibleBy4 = newList.stream().filter(a -> a % 4 == 0).map(b -> b * 5).collect(Collectors.toList());
        System.out.println(divisibleBy4);

        // filter needs to come before map
        // map() method in streams used for altering the data

        System.out.println("--------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Man", "John", "Doe", "Josh", "Ryan"));
        names.stream().skip(3).map(String::toUpperCase).map(b -> b.charAt(0) + "" + b.charAt(b.length() - 1)).forEach(System.out::println);
        names.stream().skip(3).forEach(a -> System.out.println(a));

        System.out.println("---------------------");

        Integer[] array = {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6,};
        array = Arrays.asList(array).stream().distinct().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
        System.out.println("------------------");

        List<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(25, 41, 63, 89, 7, 8, 5, 4, 1, 2, 3, 6, 9));
        nums.stream().limit(5).forEach(System.out::println); // limit print from first index to the index of the given number
        System.out.println("=====");
        nums.stream().skip(5).forEach(System.out::println);// skip will skip all elements up to the specified element print from given index to the end

        System.out.println("*************");

        List<Integer> score = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int result = score.stream().filter(p -> p % 2 == 1).reduce(10, (x, y) -> x + y);
        int result2 = score.stream().filter(p -> p % 2 == 1).reduce(0, (x, y) -> x + y);
        System.out.println(result);
        System.out.println(result2);

        System.out.println("--------------------------");

        List<String> words = new ArrayList<>(Arrays.asList("Java", "Anna", "Level", "Kayak", "Python"));
        String palindromes = words.stream().filter(p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p))
                .reduce("", (a, b) -> a + " " + b);

        System.out.println(palindromes);
        System.out.println("********************");

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 40));

        boolean allEven = list1.stream().allMatch(p -> p % 2 == 0);
        System.out.println(allEven);
        boolean lessThan11 = list1.stream().allMatch(p -> p < 100);
        System.out.println(lessThan11);
        boolean hasOneDivisibleBy20 = list1.stream().anyMatch(p -> p % 20 == 0);
        System.out.println(hasOneDivisibleBy20);


    }
}
