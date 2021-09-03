package cybertekJavaNewFeatures;

import java.util.*;
import java.util.function.BiFunction;

/**
 * Created by Marwan on 9/2/2021 around 7:56 PM
 */
public class BiFunctionFunctionalInterface {

    public static void main(String[] args) {

        BiFunction<int[], int[], List<Integer>> mergeArraysToList = (arr1, arr2) -> {
            List<Integer> list = new ArrayList<>();
            for (int i : arr1) list.add(i);
            for (int i : arr2) list.add(i);
            return list;
        };

        List<Integer> myList = mergeArraysToList.apply(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10});

        System.out.println(myList);
        System.out.println("-------------");

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> addListsToMap = (a, b) -> {
            Map<String, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < a.size(); i++) map.put(a.get(i), b.get(i));
            return map;
        };

        List<String> strList = new ArrayList<>(Arrays.asList("Marwan", "Mahdi", "Majd"));
        List<Integer> ageList = new ArrayList<>(Arrays.asList(35, 9, 4));
        Map<String,Integer> employees = addListsToMap.apply(strList,ageList);

        System.out.println("employees = " + employees);

        employees.forEach((k,v) ->{
            if (v<30) System.out.println(k);
        });
    }
}
