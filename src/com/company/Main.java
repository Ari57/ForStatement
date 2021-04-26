package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for (int i = 1; i < 5; i++) {
//  init is the code that will be initialised at the start
//  termination tells the for loop how we want to exit
//  increment is invoked each time the loop goes round, similar to a count
//  the loop will keep processing until i becomes greater than or equal to 5
//  i++ will add one to the variable every loop
            System.out.println("Loop " + i + " hello!");
        }
        for (int i = 8; i >= 2; i--) {
            System.out.println("£10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
            // outputs to two decimal points (.2f)
        }
        int count = 0;

        for (int i = 1; i < 11; i++) {
            if (isPrime(i)) { // returns true if a prime number is found
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }

            }
        }
    }


    public static boolean isPrime(int n) {

        for (int i = 0; i < 11; i++) {
            // += means + in a for loop
            if (n == 1) { // checks to see if n is equal to 1
                return false;
            }
            for (int i2 = 2; i2 <= n/2; i2++) {
                System.out.println("Looping " +i2);// prime numbers have to be greater than 1
                if ((n % i2) == 0) { // if n can divide by 2, it can't be a prime number
                    return false; // above checks if n is equal to 0 after being divided by 1
                }
            }
        }
        return true; // by this part, n is equal to a prime number
    }


    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));

        }
    }


