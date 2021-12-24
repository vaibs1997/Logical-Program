package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = input.nextInt();
        reverseDigit(num);
    }

    static void reverseDigit(int num){
        System.out.print("Reverse of " + num + " is ");
        int reverse = 0;
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.print(reverse);
    }
}
