package cybertekJavaNewFeatures;

/**
 * Created by Marwan on 9/1/2021 around 7:18 PM
 */
public class CustomFunctionalInterface {


    public static void main(String[] args) {

        StringFunctions longestString = (a,b) -> {
            if (a.length()>b.length()) return a;
            else return b;
        };
        System.out.println(longestString.function("Marwan","Subhi"));

        System.out.println("**********************");

        DataFunction<String> reverse = a -> new StringBuilder(a).reverse().toString();

        // if we have only one parameter we can exclude parenthesis , same thing with body we can exclude curly braces if we have one statement
        System.out.println(reverse.function("Mahdi"));
    }
}
