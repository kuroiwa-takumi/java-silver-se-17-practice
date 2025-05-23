package com.example.demo.purple.chapter6;

public class Derived extends Base {
    @Override
    public void methodX() {
        System.out.println("Derived methodX");
    }
    @Override
    void methodB() {
        System.out.println("Derived methodB");
    }
}
