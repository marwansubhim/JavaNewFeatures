package oilfielcalculations;

/**
 * Created by Marwan on 04 Jan, 2024 around 10:01 PM
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("hello marwan");
        AddToNum checker = ch -> ch+2;
        System.out.println(checker.addToInput(5));

        AddToNum checkOddOrEven = ch-> ch+25;
        System.out.println(checkOddOrEven.addToInput(5));

        CheckEvenOrOdd checkEvenOrOdd = (p)-> {

            System.out.println(p +" is an even number");
            return true;
        };
        System.out.println(checkEvenOrOdd.checker(25));



    }
}

@FunctionalInterface
interface AddToNum {
    int addToInput(int num);
}

@FunctionalInterface
interface CheckEvenOrOdd{
    boolean checker(int num);
}


