package ControlAssignments;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        for (; num != 0; num /= 10) {
            sum += num % 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
