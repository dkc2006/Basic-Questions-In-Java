package basicQuestions;

import java.util.Scanner;

public class BinomialCoefficient {
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }

    public static int binomialCoefficient(int n, int r) {
        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nmrFactorial = factorial(n - r);

        // Using long to avoid integer overflow
        long binomialCoefficient = (long) nFactorial / (rFactorial * (long) nmrFactorial);
        return (int) binomialCoefficient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        if (r > n) {
            System.out.println("Invalid input: r cannot be greater than n.");
        } else {
            System.out.println("Binomial Coefficient (nCr): " + binomialCoefficient(n, r));
        }
    }
}
