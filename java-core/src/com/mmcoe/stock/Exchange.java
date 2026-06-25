package com.mmcoe.stock;

public class Exchange {
    protected int id;
    protected String name;

    public Exchange(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
}