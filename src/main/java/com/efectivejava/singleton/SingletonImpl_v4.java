package com.efectivejava.singleton;

public class SingletonImpl_v4 {
    // Inner class
    // Object creation using Clone and Serialization
    private SingletonImpl_v4() {
    }

    private static class LazyInit {
        private static final SingletonImpl_v4 repository = new SingletonImpl_v4();
    }

    public static SingletonImpl_v4 getRepository() {
        return LazyInit.repository;
    }
}
