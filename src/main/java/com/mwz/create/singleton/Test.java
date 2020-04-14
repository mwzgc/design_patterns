package com.mwz.create.singleton;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mwz.create.singleton.Singleton");
        Class.forName("com.mwz.create.singleton.HungrySingleton");

        System.out.println("start");
        Singleton.getInstance();
        HungrySingleton.getInstance();
    }

}
