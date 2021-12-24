package com.bridgelabz.logicalproblems;

public class logicalProblem {
    public static void main(String[] args) {
        fibonacciSeries();
    }

    // method to compute fibonacci series
    static void fibonacciSeries(){
        int a = 0, b = 1, c, num=10;
        System.out.println("Value of a: " + a + "\nValue of b: " + b);
        for (int i = 2; i < num; i++){
            c = a+b;
            System.out.println("Value of c: " + c);
            a=b;
            b=c;
        }
    }
}
