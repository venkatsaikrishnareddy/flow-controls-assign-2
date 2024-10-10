package ControlAssignments;

import java.util.Scanner;

public class PowerWithoutPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exp = scanner.nextInt();

        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        System.out.println(base + "^" + exp + " = " + result);
    }
}
