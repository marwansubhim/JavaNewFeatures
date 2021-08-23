package lambdaExpression;

/**
 * Created by: Marwan on 8/22/2021 around 8:11 PM
 */
public class Less2 {

    public static void main(String[] args) {
        ReturnMethodWithParams addNums = (a, b) -> a + b;
        System.out.println(addNums.nums(2, 4));

        ReturnMethodWithParams subtractNums = (a, b) -> a - b;

        System.out.println(subtractNums.nums(10, 7));

        ReturnMethodWithParams multiplyNums = (a, b) -> a * b;

        System.out.println(multiplyNums.nums(5, 2));

        ReturnMethodWithParams sumOfDifference = (a,b)->{
            int result = 0;
            if (a>b){

                int sub = a - b;
                for (int i = 0; i<=sub ; i++){
                    result += i;
                }
            }
            else {
                int sub = b - a;
                for (int i=0; i<=sub ; i++){
                    result +=i;
                }
            }
            return result;
        };

        System.out.println(sumOfDifference.nums(5, 20));// 0+1+2+3+4

        ReturnMethodWithParams divideNums = (a,b) -> {
            int result = 0;
            if (a>b && b!=0){
                result = a/b;
            }else if (b>a && a!=0){
                result = b /a;
            }
            return result;
        };

        System.out.println(divideNums.nums(4, 20));// good work
        // create more interfaces

    }


}

@FunctionalInterface
interface ReturnMethodWithParams {

     int nums(int a, int b);
}