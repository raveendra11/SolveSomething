package i.solvesomething;

import java.util.Scanner;

public class Factorial {

    public void findFactorial(int number) {
        int fact = 1;
        for (int i = number; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Factorial object = new Factorial();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find its factotial :");
        object.findFactorial(input.nextInt());
    }
}
