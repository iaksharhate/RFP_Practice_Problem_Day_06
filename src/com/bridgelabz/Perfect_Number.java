package com.bridgelabz;
import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to checked as a perfect number.");
        int perfectCheck = scanner.nextInt();

        PerfectCheck(perfectCheck);
    }

    public static void PerfectCheck(int perfectCheck){
        int remainder;
        int sum = 0;

        for (int i=1; i < perfectCheck; i++){
            remainder = perfectCheck % 1;
            if (remainder == 0){
                sum = sum + 1;
            }
        }
        if (sum == perfectCheck){
            System.out.println("Number is perfect number!");
        }else{
            System.out.println("Number is not perfect number!");
        }
    }
}