package ControlAssignments;
import java.util.Scanner;

public class StrongNumbersBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();

        for (int num = 1; num <= n; num++) {
            if (isStrong(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isStrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
