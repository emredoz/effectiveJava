package com.efectivejava.singleton;


import java.io.Serializable;

public class SingletonImpl_v5 implements Cloneable, Serializable {
    // Solution for Thread, Performance, Clone
    private SingletonImpl_v5() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }


    private static class LazyInit {
        private static final SingletonImpl_v5 repository = new SingletonImpl_v5();
    }


    public static SingletonImpl_v5 getRepository() {
        return LazyInit.repository;
    }

}
