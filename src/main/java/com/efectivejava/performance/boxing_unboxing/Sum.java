package com.efectivejava.performance.boxing_unboxing;

public class Sum {

    public static void main(String[] args) {
        Long sum = 0l;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
