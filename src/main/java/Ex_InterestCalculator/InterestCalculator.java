package Ex_InterestCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestCalculator {

    public void run() {
        System.out.println("*** Exercise: Interest Calculator ***");
        Scanner sc = new Scanner(System.in);
        System.out.print("How much do you want to invest? ");
        double principle = sc.nextDouble();
        System.out.print("How many years are investing? ");
        int years = sc.nextInt();
        System.out.print("What is the annual interest rate % growth? ");
        double rate = sc.nextInt();
        System.out.println("Choose compound period (Enter corresponding number):");
        boolean valid = false;
        int compoundPeriod = 0;
        while (!valid) {
            System.out.println("-- 1: Quarterly \n" +
                    "-- 2: Monthly\n" +
                    "-- 3: Daily");
            int menuOption = sc.nextInt();
            switch (menuOption) {
                case 1:
                    compoundPeriod = 4;
                    valid = true;
                    break;
                case 2:
                    compoundPeriod = 12;
                    valid = true;
                    break;
                case 3:
                    compoundPeriod = 365;
                    valid = true;
                    break;
                default:
                    System.out.println("Invalid entry, please try again.");
                    break;
            }
        }

        double multiplierRate = Math.pow(rate/(compoundPeriod*100) +1, compoundPeriod);
        System.out.println("\nCalculating...");
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 1; i<=years;i++) {
            System.out.println("Year " +i+":");
            System.out.println("Began with $"+df.format(principle));
            double yearEnd = principle*multiplierRate;
            System.out.println("Earned with $"+df.format(yearEnd-principle));
            System.out.println("Began with $"+df.format(yearEnd));
            principle = yearEnd;
            System.out.println();
        }
    }
}
