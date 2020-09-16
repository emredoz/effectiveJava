package com.efectivejava.method.varargs;

public class Varargs {

    private static int minV1(int... args) {
        if (args.length == 0) {
            throw new RuntimeException();
        }
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min){
                min = args[i];
            }
        }
        return min;
    }

    private static int minV2(int first, int... args) {
        int min = first;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min){
                min = args[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minV1(1,2,3,4,5,6));
        System.out.println(minV2(1,2,3));
        System.out.println(minV1());

        // System.out.println(minV2());

    }
    // varargs kullanımında ilk değeri parametrik hale getirerek derleme zamanında hata vermesini sağlarız.
    // 33 satır hata veriyor.
}
