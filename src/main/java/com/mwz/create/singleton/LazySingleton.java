package com.mwz.create.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    private static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
