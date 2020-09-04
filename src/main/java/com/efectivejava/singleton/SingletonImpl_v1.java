package com.efectivejava.singleton;

public class SingletonImpl_v1 {
    // DoubleCheck
// Tread problem
    private static SingletonImpl_v1 repository;

    private SingletonImpl_v1() {
    }


    public static SingletonImpl_v1 getRepository() {
        if (repository == null) {
            if (repository == null) {
                repository = new SingletonImpl_v1();
            }
        }
        return repository;
    }


}
