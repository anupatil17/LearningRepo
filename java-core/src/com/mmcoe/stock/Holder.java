package com.mmcoe.stock;



public class Holder extends Exchange {

    public Holder(int id, String name) {
        super(id, name);
    }

    public void buyStock(Stock stock, int quantity) {
        System.out.println(name + " bought " + quantity +
                " shares of " + stock.name);
    }
}