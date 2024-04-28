package basicQuestions;

import java.util.Scanner;

public class FindIfNumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int divisor = 2;
        boolean isPrime = true;

        while (divisor < num) {
            if (num % divisor == 0) {
                isPrime = false;
                break;
            }
            divisor++;
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
