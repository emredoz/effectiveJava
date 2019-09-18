package com.efectivejava.inheritance;

public class ParentClass {

    private int privateOnlyParent = 1;
    protected int protectedOnlyParent = 1;

    public ParentClass() {
        System.out.println("Ali");
    }

    public String getFrom(){
        return "From ParentClass";
    }

    public String onlyParent(){
        return "Only ParentClass";
    }

    int getPrivateOnlyParent() {
        return privateOnlyParent;
    }

    public void setPrivateOnlyParent(int privateOnlyParent) {
        this.privateOnlyParent = privateOnlyParent;
    }
}
