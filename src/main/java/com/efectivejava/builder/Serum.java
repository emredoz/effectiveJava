package com.efectivejava.builder;

public class Serum {
    private final int water; //  required
    private final int sodiumIon; //  required
    private final int magnesium; // optional
    private final int creatine; // optional
    private final int globulin;  // optional
    private final int carbohydrate; // optional

    public static class Builder{
        // Required parameters
        private final int water;
        private final int sodiumIon;

        // Optional parameters - initialized to default values
        private int magnesium = 0;
        private int creatine = 0;
        private int globulin = 0;
        private int carbohydrate = 0;

        public Builder(int water, int sodiumIon) {
            this.water = water;
            this.sodiumIon = sodiumIon;
        }

        public synchronized Builder magnesium(int value){
            this.magnesium = value;
            return this;
        }

        public synchronized Builder creatine(int val) {
            creatine = val;
            return this;
        }

        public synchronized Builder globulin(int val) {
            globulin = val;
            return this;
        }

        public synchronized Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Serum build(){
            return new Serum(this);
        }
    }

    private Serum(Builder builder) {
        this.water = builder.water;
        this.sodiumIon = builder.sodiumIon;
        this.magnesium = builder.magnesium;
        this.creatine = builder.creatine;
        this.globulin = builder.globulin;
        this.carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "Serum{" +
                "water=" + water +
                ", sodiumIon=" + sodiumIon +
                ", magnesium=" + magnesium +
                ", creatine=" + creatine +
                ", globulin=" + globulin +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static void main(String[] args) {
        Serum serum = new Builder(240,12).magnesium(30).creatine(15).globulin(78).build();
        System.out.println(serum);
    }
}
