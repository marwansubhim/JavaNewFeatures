package functionalInterfaces;

/**
 * Created by: Marwan on 8/26/2021 around 9:04 PM
 */
public class Less2 {

    public static void main(String[] args) {

        double hourlyRate = 42;

        double weeklySalary = (hourlyRate * 40) + (51 * hourlyRate * 1.5);

        double yearlySalary = weeklySalary * 4 * 12;

        System.out.println("yearly salary is " + yearlySalary);


    }
}
