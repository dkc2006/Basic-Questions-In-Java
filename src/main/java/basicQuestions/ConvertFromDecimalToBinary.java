package basicQuestions;

import java.util.Scanner;

public class ConvertFromDecimalToBinary {
    public static void decimalToBinary(int num) {
        int myNum = num;
        int pow = 0;
        int binNum = 0;
        while (num > 0) {
            int rem = num % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;
        }
        System.out.println("Binary Form Of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        decimalToBinary(num);
    }
}
