package oilfielcalculations;

/**
 * Created by: Marwan on 9/18/2021 around 8:02 AM
 */
public class PumpsCalculations {
    static double MUD_WEIGHT_PPG = 12.0;
    static double MUD_WEIGHT_LBFT3 = 100;
    static double MUD_WEIGHT_SG = 1.0;
    static double pressureGradiant = 0.4992;

    public static void main(String[] args) {

        /**
         * Pressure gradient, psi/ft, using mud weight, ppg
         * psi/ft = mud weight, ppg x 0.052 Example: 12.0 ppg fluid
         * psi/ft = 12.0 ppg x 0.052
         * psi/ft = 0.624
         *
         */
        OneParamFormula pressureUsingPPG = mudWeight -> mudWeight * 0.052;
        System.out.println("The pressure per square foot of " + MUD_WEIGHT_PPG + " ppg is " + pressureUsingPPG.performOperation(MUD_WEIGHT_PPG) + " psi/ft");

        /**
         * Pressure gradient, psi/ft, using mud weight, lb/ft3
         * psi/ft = mud weight, lb/ft3 x 0.006944 Example: 100 lb/ft3 fluid
         * psi/ft = 100 lb/ft3 x 0.006944
         * psi/ft = 0.6944
         *
         */
        OneParamFormula pressureUsingLBPerFt3 = mudWeight -> mudWeight * 0.006944;
        System.out.println("The pressure per square foot of " + MUD_WEIGHT_LBFT3 + " lb/ft^3 is " + pressureUsingLBPerFt3.performOperation(MUD_WEIGHT_LBFT3) + " psi/ft");

        /**
         * Pressure gradient, psi/ft, using mud weight, specific gravity (SG)
         * psi/ft = mud weight, SG x 0.433 Example: 1.0 SG fluid
         * psi/ft = 1.0 SG x 0.433
         * psi/ft = 0.433
         *
         */

        OneParamFormula pressureUsingSG = mudWeight -> mudWeight * 0.433;

        System.out.println("The pressure per square foot of "+MUD_WEIGHT_SG+" SG is "+pressureUsingSG.performOperation(MUD_WEIGHT_SG)+ " psi/ft");

        /**
         * Convert pressure gradient, psi/ft, to mud weight, ppg
         * ppg = pressure gradient, psi/ft ÷ 0.052 Example: 0.4992 psi/ft
         * ppg = 0.4992 psi/ft : 0.052
         * ppg = 9.6
         *
         */

        OneParamFormula convertPSItoMusWeightPPG = psi -> psi / 0.052;
        System.out.println("The ppg of "+pressureGradiant+" psi is "+convertPSItoMusWeightPPG.performOperation(pressureGradiant)+" ppg");

        System.out.println("****************************");


    }
}

@FunctionalInterface
interface OneParamFormula {
    double performOperation(double a);
}

@FunctionalInterface
interface TwoParamsFormula {
    double performOperation(double a, double b);
}