package cybertekJavaNewFeatures;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Created by Marwan on 9/2/2021 around 7:37 PM
 */
public class BiConsumerFunctionalInterface {

  public static BiConsumer <String,Integer> printNumberOfTimes = (str,num)->{
        for (int i = 1; i <=num ; i++) {
            System.out.println(str);
        }
    };

    public static void main(String[] args) {

        printNumberOfTimes.accept("marwan",5);

        System.out.println("-----------");
        Map<String, LocalDate> employeesMap = new LinkedHashMap<>();
        employeesMap.put("Marwan",LocalDate.of(2020,10,25));
        employeesMap.put("Mahdi",LocalDate.of(2015,8,20));
        employeesMap.put("Manara",LocalDate.of(2012,9,2));
        employeesMap.put("Majd",LocalDate.of(2002,1,5));

//        for (Map.Entry<String, LocalDate> each : employeesMap.entrySet()) {
//            System.out.println(each.getKey() + ":"+each.getValue());
//        }
        employeesMap.forEach((k,v) -> {
            if (v.getYear()<2010) System.out.println(k);
           // System.out.println(k+" : "+v)
        });

        // Hey, this what i have done so far
        for (int i =0; i<5; i++){
            System.out.println("Eric Davis");
        }
    }
}
