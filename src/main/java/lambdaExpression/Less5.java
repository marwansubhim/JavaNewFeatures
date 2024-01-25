package lambdaExpression;

import java.util.Arrays;

/**
 * Created by Marwan on 14 Jan, 2024 around 10:18 AM
 */
public class Less5 {

    public static void main(String[] args) {

        String[] team = {"Marwan","Yousif","Jacob","Mahdi"};

        System.out.println(Arrays.toString(team));
        System.out.println(team[3]);

        System.out.println("******************");

        for (int i = 0; i<team.length; i++){

            if (team[i].toLowerCase().startsWith("m")){
                System.out.println(team[i]);
            }

        }
        System.out.println("*********************");

        for (int i = team.length-1; i >= team.length/2; i--) {

            System.out.println(team[i]);

        }
    }
}
