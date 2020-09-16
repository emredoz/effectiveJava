package com.efectivejava.method.override;

import java.util.Arrays;
import java.util.List;

class Arac {

    static String getMarka() {
        return "Arac";
    }
}

class Otomobil extends Arac {

    static String getMarka() {
        return "Otomobil";
    }
}

class Mercedes extends Otomobil {

    static String getMarka() {
        return "Mercedes";
    }
}

public class Overrride {

    public static void main(String[] args) {
        List<Arac> aracList = Arrays.asList(new Arac(), new Otomobil(), new Mercedes());

        aracList.forEach(a -> {
            System.out.println(a.getMarka());
        });
    }
}
