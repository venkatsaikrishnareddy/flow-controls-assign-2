package ControlAssignments;

import java.util.Scanner;

public class PowerUsingPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exp = scanner.nextDouble();

        double result = Math.pow(base, exp);

        System.out.println(base + "^" + exp + " = " + result);
    }
}
