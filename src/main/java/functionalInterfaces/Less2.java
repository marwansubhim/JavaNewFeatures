package functionalInterfaces;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by: Marwan on 8/26/2021 around 9:04 PM
 */
public class Less2 {

    public static void main(String[] args) {

     LocalDate d =  LocalDate.of(1986,4,13);
        System.out.println("my DOB is "+d);
        LocalDate.now().getYear();

        double hourlyRate = 42;

        double weeklySalary = (hourlyRate * 40) + (51 * hourlyRate * 1.5);

        double yearlySalary = weeklySalary * 4 * 12;

        System.out.println("yearly salary is " + yearlySalary);

        CalculateSalary salary = (a, b) -> {
            double minimumWeekly = 40;
            double overTime = b - minimumWeekly;

            return ((a * minimumWeekly) + (1.5 * a * overTime)) * 4 * 12;
        };

        System.out.println(salary.performSalaryCalculation(75,40));

        //Hello

        CalculateAge calculateAge = a -> {
            return LocalDate.now().getYear() -a;
        };

        System.out.println("My age is "+calculateAge.calcAge(2017));
    }
}
@FunctionalInterface
interface CalculateSalary{

    double performSalaryCalculation(double hourlyRate, double weeklyHours);
}


@FunctionalInterface
interface MySalary extends CalculateSalary{
    // When we don't have any abstract method in an annotated interface we get compilation error but
    // if we us inheritance by extending a valid functional interface it will compile just fine because it lined up with the rules
    // of functional interface

}


interface CalculateAge{
    int calcAge(int yearBorn);
}