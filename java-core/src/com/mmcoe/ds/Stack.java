package com.mmcoe.ds;

public class Stack {
    private int[] arr;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }
  
    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
        System.out.println(data + " pushed into stack");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}