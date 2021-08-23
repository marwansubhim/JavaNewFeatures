package lambdaExpression;

import java.security.PublicKey;

/**
 * Created by: Marwan on 8/22/2021 around 11:59 AM
 */
public class Less1 {


    public static void main(String[] args) {


        voidWithoutParams();
        System.out.println("************");
        voidWithParams();
        System.out.println("************");
        voidWithTwoParams(20, 5);


    }

    private static void voidWithoutParams() {
        VoidWithNoParameters message1 = () -> System.out.println("Hello world"); //  if we have one statement we can exclude the {}

        VoidWithNoParameters message2 = () -> {
            String message = "Good morning everyone";
            System.out.println("hello and " + message);
        };

        VoidWithNoParameters message3 = () -> {

            String myName = "Marwan";
            String reverse = "";
            String[] letters = myName.split("");
            for (int i = letters.length - 1; i >= 0; i--) {
                reverse += letters[i];
            }
            System.out.println(reverse);
        };

        message1.printHello();
        message2.printHello();
        message3.printHello();
    }

    private static void voidWithParams() {
        VoidWithParameters printMessage1 = (input) -> System.out.println("my input is " + input);
        printMessage1.printInput("Marwan");

        VoidWithParameters printThisName = (name) -> {
            String greeting = "Good afternoon";
            System.out.println(greeting.toUpperCase() + " " + name.toLowerCase());
        };
        printThisName.printInput("Mahdi");
    }

    private static void voidWithTwoParams(int num1, int num2) {
        VoidWithTwoParam nums1 = (n1, n2) -> {
            int result = n1 + n2;
            System.out.println("The resultant of the add calculations is: " + result);
        };
        VoidWithTwoParam nums2 = (n1, n2) -> {
            int squareNum1 = n1 * n1;
            int squareNum2 = n2 * n2;
            int sum = squareNum1 + squareNum2;

            System.out.println("The square of " + n1 + " is " + squareNum1 + " and the square of " + n2 + " is " + squareNum2 + " and the sum of squares is " + sum);
        };
        nums1.addNumsAndPrint(num1, num2);
        System.out.println("**************");
        nums2.addNumsAndPrint(num1, num2);
        System.out.println("**************");
        VoidWithTwoParam subtractNums = (n1, n2) -> System.out.println("The subtraction of " + n1 + " and " + n2 + " is " + (n1 - n2));
        subtractNums.addNumsAndPrint(num1,num2);
        System.out.println("**************");

    }

}

interface ReturnWithParameters{

}

@FunctionalInterface
interface VoidWithTwoParam {
    void addNumsAndPrint(int n1, int n2);
}


@FunctionalInterface
interface VoidWithNoParameters {
    void printHello();
}

@FunctionalInterface
interface VoidWithParameters {
    void printInput(String input);
}


//    the traditional way of implementing interfaces as follows:
//    public class Less1 implements voidWithNoParameters
//    @Override
//    public void printHello() {
//        System.out.println("Hello");
//        Less1 less1 = new Less1();
//        less1.printHello();