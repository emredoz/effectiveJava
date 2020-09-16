package com.efectivejava.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LamdaEffective {

    static List<String> words = Arrays.asList("Merhaba", "Dunya", "test");

    public static void main(String[] args) {

        //   Collections.sort(words, new Comparator<String>() {
        //       @Override
        //       public int compare(String s1, String s2) {
        //           return Integer.compare(s1.length(),s2.length());
        //       }
        //   });
        //   System.out.println(words);

        //    Collections.sort(words,(s1,s2)->Integer.compare(s1.length(),s2.length()));
        //    System.out.println(words);

        //    Collections.sort(words, Comparator.comparingInt(String::length));
        //    System.out.println(words);

        words.sort(Comparator.comparingInt(String::length));
        System.out.println(words);

    }
}
