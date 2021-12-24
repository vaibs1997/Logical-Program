package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class couponNumber {

    static int[] arr = new int[20];
    static int COUNTER_FOR_NUMBERS=0;
    static int COUNTER_FOR_DISTINCTS=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the random number of coupons you want to generate: ");
        int total = sc.nextInt();
        randomNumberGenerate(total);
        System.out.println("Distinct coupons are: ");
        processDistinctCoupon(total);
        System.out.println("Total coupon generated " + COUNTER_FOR_NUMBERS + " times for " + COUNTER_FOR_DISTINCTS + " distinct coupons");
    }

    public static void randomNumberGenerate(int n) {
        for (int i = 0; i < n; i++) {

            arr[i] = (int)Math.floor(Math.random() * 10 + 1);
            System.out.println(arr[i]+" ");
            COUNTER_FOR_NUMBERS++;
        }
    }
    public static void processDistinctCoupon(int m) {
        int j, k;
        for (j = 0; j < m ; j++) {
            int count = 0;
            for ( k = 0; k < m; k++) {
                if(arr[j] == arr[k]) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println(arr[j]+" ");
                COUNTER_FOR_DISTINCTS++;
            }
        }
    }

}
