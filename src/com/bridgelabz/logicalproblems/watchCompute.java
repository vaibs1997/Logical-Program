package com.bridgelabz.logicalproblems;

public class watchCompute {
    public static void main(String[] args) {
        watchComp();
    }

    static void watchComp(){
        long start = System.nanoTime();
        long stop = System.nanoTime();
        System.out.println(stop-start + " elapse watch time");
    }
}
