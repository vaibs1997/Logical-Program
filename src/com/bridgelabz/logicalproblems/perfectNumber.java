package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class perfectNumber {

    public static void main(String[] args) {

        long number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        number = input.nextLong();

        //calling the perfect method and result will be in the result.
        long result = perfectNum(number);

        //checking the number is equal to the quotient sum
        if(number == result)
            System.out.println(number + " is a Perfect Number");
        else
            System.out.println(number + " is not a Perfect Number");
    }

    static long perfectNum(long num){
        long sum =0;
        for(int i=1;i<=num/2;i++){
            if(num % i == 0){
                sum =sum+i;
            }
        }
        return sum;
    }
}
