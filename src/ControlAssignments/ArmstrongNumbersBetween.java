package ControlAssignments;

import java.util.Scanner;

public class ArmstrongNumbersBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();

        for (int num = 1; num <= n; num++) {
            int originalNum = num;
            int sum = 0;
            int digits = 0;

            for (int temp = num; temp != 0; temp /= 10) {
                digits++;
            }

            for (int temp = num; temp != 0; temp /= 10) {
                int remainder = temp % 10;
                sum += Math.pow(remainder, digits);
            }

            if (sum == originalNum) {
                System.out.print(num + " ");
            }
        }
    }
}
