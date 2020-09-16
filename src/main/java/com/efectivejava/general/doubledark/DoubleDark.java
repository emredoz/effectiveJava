package com.efectivejava.general.doubledark;

import java.math.BigDecimal;

public class DoubleDark {

    public static void main(String[] args) {
        double d1 = 1.8;
        double d2 = 0.83;

        System.out.println(d1 - d2);
        // Double tipi ondalık sayı ile uyumsuzluğundan kaynaklanır
        BigDecimal bigDecimal1 = new BigDecimal("1.8");
        BigDecimal bigDecimal2 = new BigDecimal("0.83");
        // Para işlerinde BigDecimal kullanınız.
        System.out.println(bigDecimal1.subtract(bigDecimal2));
    }
}
