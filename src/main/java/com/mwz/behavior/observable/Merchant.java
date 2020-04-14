package com.mwz.behavior.observable;

import java.util.Observable;
import java.util.Observer;

public class Merchant implements Observer {

    private String name;

    public Merchant(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(String.format("name=%s price=%d", name, arg));
    }
}
