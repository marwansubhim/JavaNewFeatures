package functionalInterfaces;

/**
 * Created by: Marwan on 8/24/2021 around 12:20 AM
 */
public class Less1 {

    public static void main(String[] args) {
        MathOperation mathOperation = (a,b) -> a +b;

        System.out.println(mathOperation.performOperation(3, 2));
        mathOperation.performAdd(5,8);
    }

}
//  In functional interfaces we can only have one abstract method,
//  We can also have any number of default methods, private methods and static method
@FunctionalInterface
interface MathOperation{
  public abstract int performOperation(int a, int b);

  public default void performAdd(int a, int b){
      int res = addTwoNums(a,b);
      System.out.println(res);
  }
  private int addTwoNums(int a, int b){

      return a +b;
  }
  public static void printInput(int res){
      System.out.println(res);
  }



}
