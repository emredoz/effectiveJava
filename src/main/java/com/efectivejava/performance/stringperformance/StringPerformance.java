package com.efectivejava.performance.stringperformance;

public class StringPerformance {

    public static void main(String[] args) {
        String s1 = new String("emre");
        String s2 = "emre";
        String s3 = "emre";
        System.out.println("s1 == s2 :" + (s1 == s2));
        System.out.println("s2 == s3 :" + (s2 == s3));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
