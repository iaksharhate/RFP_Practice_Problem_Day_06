package com.bridgelabz;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextByte();
        ReverseNumber(number);
    }
        public static void ReverseNumber(int number){
            int reverseNumber = 0;

            while (number != 0){
                int remainder = number % 10;
                reverseNumber = reverseNumber * 10 + remainder;
                number /= 10;
            }
            System.out.println("Reversed number of "+number+" is "+reverseNumber);
        }
}
