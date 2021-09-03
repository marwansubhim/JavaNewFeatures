package cybertekJavaNewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by Marwan on 9/2/2021 around 7:05 PM
 */
public class BiPredicateFunctionalInterface {
    public static void main(String[] args) {

//        BiPredicate
//        Predicate

        BiPredicate<int[], Integer> contains = (arr, a) -> {
            boolean flag = false;
            for (int each : arr) {
                if (each == a) {
                    flag = true;
                    break;
                }
            }
            return flag;
        };

        int[] myArr = {3, 2, 5, 4, 1, 2};
        int myNum = 50;

        System.out.println(contains.test(myArr, myNum));
        System.out.println(contains.test(new int[]{3, 5, 4, 1, 8, 7, 4, 55}, 55));
        System.out.println("******************");

        BiPredicate<String, String> isAnagram = (a, b) -> {
            char[] ch1 = a.toCharArray();
            char[] ch2 = b.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1, ch2);

        };

        boolean ans = isAnagram.test("heart", "earth");
        System.out.println(ans);
        System.out.println("---------------------");

        BiPredicate<List<Integer>, Integer> isDuplicated1 = (myList, num) -> {
            int count = Collections.frequency(myList, num);
            if (count > 1) return true;
            else return false;
        };
        BiPredicate<List<Integer>, Integer> isDuplicated2 = (myList, num) -> Collections.frequency(myList, num) > 1;


        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7));

        System.out.println(isDuplicated1.test(myList, 7));
        System.out.println(isDuplicated2.test(myList, 7));

        List<Integer> myList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7,25,1,47,8,96,3));
        myList2.forEach(System.out::println);
        System.out.println("--------");
        myList2.forEach(n->{
            if (!isDuplicated2.test(myList,n)) System.out.print(n+" ");
        });
    }
}
