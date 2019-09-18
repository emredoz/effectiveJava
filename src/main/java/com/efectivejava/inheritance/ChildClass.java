package com.efectivejava.inheritance;

public class ChildClass extends ParentClass {

    public int publicOnlyChild = 1;

    @Override
    public String getFrom() {
        return "from ChildClass";
    }

    public String onlyChild(){
        return "only ChildClass";
    }

    public ChildClass() {
        System.out.println("Veli");
    }
}
