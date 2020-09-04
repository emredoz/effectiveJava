package com.efectivejava.singleton;

public class SingletonImpl_v2 {
    // Synchronized
// Performance issue
    private static SingletonImpl_v2 repository = null;

    private SingletonImpl_v2() {
    }

    public static synchronized SingletonImpl_v2 getRepository() {
        if (repository == null) {
            repository = new SingletonImpl_v2();
        }
        return repository;
    }

}
