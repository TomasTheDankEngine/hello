package hello;

import java.util.Scanner;

public class Hello {

    public static long fib(int s1, int s2, int max) {
        if (s1 == 0 & s2 == 0) {
            return 0;
        }
        int next = s1 + s2;
        System.out.println(next);
        if (next > max) {
            return next;
        }
        return fib(s2, next, max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char check = 'y';
        int num1, num2, max;
        while (check == 'y') {
            System.out.println("Enter first sequence number: ");
            num1 = sc.nextInt();
            System.out.println("Enter second sequence number: ");
            num2 = sc.nextInt();
            System.out.println("Enter the max number limit: ");
            max = sc.nextInt();
            System.out.print("Fibonacci sequence of numbers to " + max + ": \n");
            System.out.println(num1);
            System.out.println(num2);
            System.out.print(fib(num1, num2, max));
            System.out.println("\nCalculate again (y)?");
            check = sc.next().charAt(0);
        }
    }
}
