package basicQuestions;

import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        if(num==0){
            System.out.println(0);
        }
        else {
            for(int i = 0; i < num; i++){
                int input = scanner.nextInt();
                sum += input;
                System.out.print(sum+" ");
            }
        }
    }
}
