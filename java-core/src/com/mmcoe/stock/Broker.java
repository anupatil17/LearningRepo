package com.mmcoe.stock;

public class Broker extends Exchange {

    public Broker(int id, String name) {
        super(id, name);
    }

    public void executeTrade() {
        System.out.println("Broker " + name + " executed the trade.");
    }
}