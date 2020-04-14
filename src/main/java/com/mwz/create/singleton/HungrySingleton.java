package com.mwz.create.singleton;

public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("HungrySingleton");
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

}
