package lambdaExpression;

/**
 * Created by: Marwan on 8/23/2021 around 12:23 PM
 */
public class Less4 {

    public static void main(String[] args) {

        int firstInt = 10, secondInt = 6;

        ArithmeticOperation oldSum = new ArithmeticOperation() {
            @Override
            public int performOperation(int a, int b) {
                return a + b;
            }
        };

        System.out.println("" +
                "The sum of two input integers without lambda is: " + oldSum.performOperation(firstInt, secondInt));

        ArithmeticOperation sum = (a, b) -> a + b;
        ArithmeticOperation sub = (a, b) -> a - b;
        ArithmeticOperation multi = (a, b) -> a * b;

        System.out.println("The sum with lambda is: "+sum.performOperation(firstInt,secondInt));
        System.out.println("The subtract with lambda is: "+sub.performOperation(firstInt,secondInt));
        System.out.println("The multiplication with lambda is: "+multi.performOperation(firstInt,secondInt));
    }
}
