package com.mmcoe.ds;

public class TestStack {

    public static void main(String[] args) {

        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(80);
        s.push(54);
        s.push(36);
        
        s.display();

        System.out.println("Popped Element: " + s.pop());

        System.out.println("Top Element: " + s.peek());

        s.display();
    }
}