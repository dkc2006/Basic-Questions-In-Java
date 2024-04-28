package basicQuestions;

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal amount (p):");
        int p = scanner.nextInt();
        if (p < 0) {
            System.out.println("Principal amount cannot be negative.");
            return;
        }
        System.out.println("Enter interest rate (r):");
        int r = scanner.nextInt();

        if (r < 0) {
            System.out.println("Interest rate cannot be negative.");
            return;
        }

        System.out.println("Enter time period (t):");
        int t = scanner.nextInt();

        if (t < 0) {
            System.out.println("Time period cannot be negative.");
            return;
        }

        // Calculate simple interest
        int simpleInterest = (p * r * t) / 100;

        System.out.println("Simple interest: " + simpleInterest);
    }
}
