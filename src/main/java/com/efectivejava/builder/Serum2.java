package com.efectivejava.builder;

public class Serum2 {
    private final int water; //  required
    private final int sodiumIon; //  required
    private final int magnesium; // optional
    private final int creatine; // optional
    private final int globulin;  // optional
    private final int carbohydrate; // optional



    public Serum2(int water, int sodiumIon) {
        this(water,sodiumIon,0,0,0,0);
    }

    public Serum2(int water, int sodiumIon, int magnesium, int creatine) {
        this(water,sodiumIon,magnesium,creatine,0,0);
    }

    public Serum2(int water, int sodiumIon, int magnesium, int creatine, int globulin, int carbohydrate) {
        this.water = water;
        this.sodiumIon = sodiumIon;
        this.magnesium = magnesium;
        this.creatine = creatine;
        this.globulin = globulin;
        this.carbohydrate = carbohydrate;
    }

    public static void main(){
        // Yazımında parametrelere extra dikkat etmek gerekiyor. Değerler birbirine karışabilir.
        // Okunabilirliği kötü

        Serum2 type = new Serum2(1,2);
        Serum2 type2 = new Serum2(1,1,1,1);
        Serum2 type3 = new Serum2(1,1,1,1,1,1);

    }
}
