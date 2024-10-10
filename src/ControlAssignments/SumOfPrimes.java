package ControlAssignments;

import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += num;
            }
        }
        System.out.println("Sum of prime numbers between 1 and " + n + ": " + sum);
    }
}
