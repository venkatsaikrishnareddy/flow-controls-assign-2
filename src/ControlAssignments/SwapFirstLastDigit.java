package ControlAssignments;

import java.util.Scanner;

public class SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int lastDigit = num % 10;
        int digits = (int) Math.log10(num);
        int firstDigit = num / (int) Math.pow(10, digits);

        int swappedNum = lastDigit * (int) Math.pow(10, digits) + (num % (int) Math.pow(10, digits) - lastDigit + firstDigit);

        System.out.println("Number after swapping first and last digit: " + swappedNum);
    }
}
