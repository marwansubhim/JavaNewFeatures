package lambdaExpression;

/**
 * Created by: Marwan on 8/23/2021 around 11:54 AM
 */
public class Less3 {

    int sum = 0;

    public void Sum() {

        int tempSum = 0;
        ArithmeticOperation sumOperation = (a, b) ->
        {
            int sum = 0;
// tempSum = 2; any variable used inside lambda expression should be final and there for if we try to reassign we get compile error
            this.sum = a + b;
            System.out.println("The value of sum inside lambda is "+sum);
            return this.sum;
        };

        System.out.println("The sum of given two numbers is "+sumOperation.performOperation(2,8));

    }

    public static void main(String[] args) {

        Less3 obj = new Less3();
        obj.Sum();
    }

}
/*
* All methods and local variables that get stored in the stack
* Class instance , object instance and static variables get stored in the heap (understood finals by the compiler)
* */

@FunctionalInterface
interface ArithmeticOperation {
    int performOperation(int a, int b);
}
// any interface that has one abstract method will be treated by the compiler as a functional interface
// we can definitely put as many methods that needs to be implemented by any class through overriding them, but we can't just use lambda representation