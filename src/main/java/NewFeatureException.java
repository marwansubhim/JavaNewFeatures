import java.util.Arrays;

/**
 * Created by: Marwan on 8/22/2021 around 11:42 AM
 */
public class NewFeatureException {

    public static void withJava7(){

        int [] arr = {1,2,3,4, 12};
         try {
             for (int i = 0; i< arr.length; i++){
                 System.out.println(arr[i]);
             }

         }catch (NullPointerException | ArrayIndexOutOfBoundsException | ClassCastException | ArithmeticException ex){
             System.out.println(ex.getStackTrace());
             System.out.println(ex.getMessage() + " check again");
         }
    }

    public static void main(String[] args) {

        withJava7();
    }
}
