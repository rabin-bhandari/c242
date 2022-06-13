package Ex_LuckySevens;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many dollars do you have?");
        int dollars = sc.nextInt();
        int totalRolls = 0;
        int maxMoney = dollars;
        int maxMoneyRolls = 0;

        Random rand = new Random();

        while (dollars > 0) {
            totalRolls++;
            if (rand.nextInt(7) + rand.nextInt(7) == 7) {
                dollars += 4;
                if (maxMoney < dollars) {
                    maxMoney = dollars;
                    maxMoneyRolls = totalRolls;
                }
            } else {
                dollars--;
            }

        }
        System.out.println("You are broke after " + totalRolls + " rolls.");
        System.out.println("You should have quit after " + maxMoneyRolls + " rolls when you had " + maxMoney + ".");

    }
}
