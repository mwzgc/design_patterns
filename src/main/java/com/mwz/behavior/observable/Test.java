package com.mwz.behavior.observable;

public class Test {

    public static void main(String[] args) {
        Goods goods = new Goods();

        Merchant m1 = new Merchant("m1");
        Merchant m2 = new Merchant("m2");
        goods.addObserver(m1);
        goods.addObserver(m2);

        goods.update(5);
        goods.update(10);
    }

}
