package com.mwz.create.singleton;

public class Singleton {

    private Singleton() {
        System.out.println("Singleton");
    }

    public static Singleton getInstance() {
        return InnerSingleton.instance;
    }

    public static class InnerSingleton {
        private static Singleton instance = new Singleton();
    }

}
