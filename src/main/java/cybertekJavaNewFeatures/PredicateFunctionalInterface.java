package cybertekJavaNewFeatures;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by Marwan on 9/1/2021 around 7:53 PM
 */
public class PredicateFunctionalInterface {

    public static void main(String[] args) {

        Predicate<Integer> isEven = a -> a % 2 == 0;

        System.out.println(isEven.test(41));


        System.out.println("**********************");
        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Marwan", "Java", "Manara", "c#", "c#", "c#"));

        Predicate<String> isUnique = a -> Collections.frequency(list, a) == 1;

        boolean r2 = isUnique.test("Java");
        System.out.println(r2);

        for (String s : list) {
            if (isUnique.test(s)) {
                System.out.println(s);
            }
        }

        System.out.println("*************************");

        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 50, 60, 70, 80));

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 40) {
                nums.remove(i);
            }
        }
        System.out.println(nums);
        System.out.println("_____________________________");

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10, 10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 50, 60, 70, 80));

        Iterator<Integer> iterator = nums2.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() < 40) iterator.remove();
        }
        System.out.println(nums2);

        System.out.println("---------------------------------");
        //removeIf()

        List<Integer> nums3 = new ArrayList<>(Arrays.asList(10, 10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 50, 60, 70, 80));

        Predicate<Integer> lessThan40 = p -> p < 40;
       // nums3.removeIf(p -> p < 40);
        nums3.removeIf(lessThan40);
        System.out.println(nums3);

    }
}
