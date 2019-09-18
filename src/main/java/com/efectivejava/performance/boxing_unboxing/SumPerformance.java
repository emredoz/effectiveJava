package com.efectivejava.performance.boxing_unboxing;

public class SumPerformance {

    public static void main(String[] args) {
        long sum =0l;
        for (long i = 0;i<=Integer.MAX_VALUE;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
