package com.mwz.behavior.observable;

import java.util.Observable;

public class Goods extends Observable {

    private Integer price;

    public void update(Integer price) {
        this.price = price;
        this.setChanged();
        this.notifyObservers(price);
    }

}
