package com.efectivejava.singleton.enumeration;

public enum Pencil {
    INSTANCE;
    private final String name = "Faber Castel";

    public void write() {
        System.out.println("write !");
    }


    public static void main(String[] args) {
        Pencil pencil = Pencil.INSTANCE;
        Pencil pencil2 = Pencil.INSTANCE;
        pencil.write();
        System.out.println("hashcode: "+pencil.hashCode());
        System.out.println("hashcode: "+pencil2.hashCode());
        System.out.println(pencil.getName());
    }

    public String getName() {
        return name;
    }
}
