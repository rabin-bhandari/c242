package Ex_Factorizer;

import java.util.Scanner;

public class Factorizer {

    public void run(){
        System.out.println("*** Exercise: Factorizer ***");
        int numOfFactors =0;
        int totalOfFactors = 0;
        boolean isPerfect = false;
        boolean isPrime = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to factor? ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("The factors of " + num+ " are:");
        for (int i =1;i<=num;i++) {
            if (num % i ==0) {
                System.out.print(i + " ");
                numOfFactors++;
                totalOfFactors +=i;
            }
        }

        if (totalOfFactors == 2*num) isPerfect = true;
        if (numOfFactors==2) isPrime = true;

        System.out.println();
        System.out.println(num+ " has "+ numOfFactors + " factors.");

        if (isPerfect) {
            System.out.println(num+" is a perfect number.");
        } else {
            System.out.println(num+ " is not a perfect number.");
        }

        if (isPrime) {
            System.out.println(num+" is a prime number.");
        } else {
            System.out.println(num+ " is not a prime number.");
        }
    }

}
