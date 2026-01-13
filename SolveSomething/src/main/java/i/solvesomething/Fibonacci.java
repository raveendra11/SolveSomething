package i.solvesomething;

import java.util.Scanner;

public class Fibonacci {

    public void getFibonacci(int num) {
        int number1 = 0, number2 = 1;
        int number3 = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("" + number3);

            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }

    }

    public static void main(String[] args) {
        Fibonacci object = new Fibonacci();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get Fibonacci series :");
        object.getFibonacci(input.nextInt());
    }
}
