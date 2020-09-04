package com.efectivejava.builder;

public class Serum3 {
    private int water; //  required
    private int sodiumIon; //  required
    private int magnesium; // optional
    private int creatine; // optional
    private int globulin;  // optional
    private int carbohydrate; // optional

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getSodiumIon() {
        return sodiumIon;
    }

    public void setSodiumIon(int sodiumIon) {
        this.sodiumIon = sodiumIon;
    }

    public int getMagnesium() {
        return magnesium;
    }

    public void setMagnesium(int magnesium) {
        this.magnesium = magnesium;
    }

    public int getCreatine() {
        return creatine;
    }

    public void setCreatine(int creatine) {
        this.creatine = creatine;
    }

    public int getGlobulin() {
        return globulin;
    }

    public void setGlobulin(int globulin) {
        this.globulin = globulin;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public static void main(){
        // Final kullanılmıyor. Getter,setter yazılırken atlanabilir. Bu sebeple tüm değerler atanmadan nesne oluşabilir.
        // Final olmadığı için herkes tarafında bu nesne field' ları değiştirilebilir.

        Serum3 type = new Serum3();
       // type.setCarbohydrate(1);
       // type.setCreatine(1);
       // type.setGlobulin(1);
       // type.setMagnesium(1);
       // type.setSodiumIon(1);
       // type.setWater(1);
    }
}
