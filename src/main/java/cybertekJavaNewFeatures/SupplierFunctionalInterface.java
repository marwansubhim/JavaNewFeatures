package cybertekJavaNewFeatures;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

/**
 * Created by Marwan on 9/1/2021 around 9:22 PM
 */
public class SupplierFunctionalInterface {

    public static void main(String[] args) {

        Supplier<String> returnString = ()-> "Marwan";

        System.out.println(returnString.get());
        System.out.println("--------------");
        Supplier<int[]> returnArray = ()-> {

            int[] arr = new int[5];

            for (int i =0; i<arr.length; i++){
                arr[i] = new Random().nextInt();
            }
            return arr;
        };
        int[] arr = returnArray.get();

        System.out.println(Arrays.toString(arr));

        System.out.println("---------------");

        Supplier<Double> returnDecimal = ()-> new Random().nextDouble();

        System.out.println(returnDecimal.get());
    }
}
