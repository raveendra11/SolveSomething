package i.solvesomething;

import java.util.Scanner;

public class PrimeNumbers {

    public boolean checkPrime(int number) {
        for (int i = 2; i <= number; i++) {
            if (i != number && number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumbers object = new PrimeNumbers();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check :");
        if (object.checkPrime(input.nextInt()) == false) {
            System.out.println("Not a prime.");
        } else {
            System.out.println("Is a prime");
        }

    }
}
