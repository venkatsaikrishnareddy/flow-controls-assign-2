package ControlAssignments;

import java.util.Scanner;

public class PerfectNumbersBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();

        for (int num = 1; num <= n; num++) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
