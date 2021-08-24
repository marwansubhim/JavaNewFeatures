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
        };// this is what they called Anonymous inner class which has more boilerplate code instead lambda is preferred only if we have one abstract method

        System.out.println("" +
                "The sum of two input integers without lambda is: " + oldSum.performOperation(firstInt, secondInt));

        // Here we are using the Lambda expression which shortened lots of boilerplate code compared to the above implementation
        // Three expressions we didn't have to write lots of code, and we are able to achieve three different behaviors as shown below:

        ArithmeticOperation sum = (a, b) -> a + b;
        ArithmeticOperation sub = (a, b) -> a - b;
        ArithmeticOperation multi = (a, b) -> a * b;

        System.out.println("The sum with lambda is: "+sum.performOperation(firstInt,secondInt));
        System.out.println("The subtract with lambda is: "+sub.performOperation(firstInt,secondInt));
        System.out.println("The multiplication with lambda is: "+multi.performOperation(firstInt,secondInt));
        SayWhateverYouWant hi = (a) -> System.out.println("Hello "+a);

        hi.HelloInput("Marwan");

    }
}
@FunctionalInterface
interface SayWhateverYouWant{
    void HelloInput(String input);
}

/**
 * Anonymous Class                                                                                   vs                      Lambda Expression
 * It's an anonymous inner class without a name                                                                   It's an anonymous method without a name
 * It can implement the interfaces with any number of abstract methods inside them,                               It can implement the interface which has one method called Functional Interface
 * They can be instantiated and can extend abstract and concrete classes                                          They can't be instantiated and can't extend abstract and concrete classes
 * Instance variables can be declared and "this" inside it always refer to the current inner class                Only local variables can be declared and "this" inside it always refer to the outer enclosing class
 * Memory inside heap will be allocated on demand whenever we create an object for it                             Permanent memory (Method area) will be allocated for it
 * Anonymous class objects get stored inside the heap                                                             Lambda get stored inside the stack
 *
 */