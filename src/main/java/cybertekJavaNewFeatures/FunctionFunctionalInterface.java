package cybertekJavaNewFeatures;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by Marwan on 9/1/2021 around 9:40 PM
 */
public class FunctionFunctionalInterface {

    public static void main(String[] args) {
        Function<String, String> upperString = String::toUpperCase;
        System.out.println(upperString.apply("cybertek"));

        Function<int[],int[]> reverseIntArray = p ->{
            int[] reversed = new int[p.length];
            for (int i = 0, j = p.length-1; i< p.length; i++,j--){
                reversed[j] = p[i];
            }
            return reversed;
        };

        System.out.println(Arrays.toString(reverseIntArray.apply(new int[]{1, 5, 6, 7, 4, 9})));

        System.out.println("*********");

        int[] arr1 = {6,4,5,8,7};
        int[] arr2 = reverseIntArray.apply(arr1);
        System.out.println(Arrays.toString(arr2));

        System.out.println("*******************");

        Function<String,String> reverse = s ->{
            String result = "";
            for(int i = s.length()-1; i >=0; i--)
                result += s.charAt(i);
            return result;
        };
        Function<String,Boolean> isPalindrome = s-> reverse.apply(s).equalsIgnoreCase(s);

        System.out.println(isPalindrome.apply("mamc"));

    }
}
