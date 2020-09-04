package com.efectivejava.singleton;

public class SingletonImpl_v3 {
    // Static
// Lazy loading issue
    private static SingletonImpl_v3 repository = new SingletonImpl_v3();

    private SingletonImpl_v3() {
    }

    public static SingletonImpl_v3 getRepository() {
        return repository;
    }
}
