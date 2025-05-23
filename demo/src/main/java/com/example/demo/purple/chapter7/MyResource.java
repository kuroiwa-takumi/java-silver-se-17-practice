package com.example.demo.purple.chapter7;

public class MyResource implements AutoCloseable{
    public MyResource() {
        System.out.println("MyResource new");
    }
    public void myMethod() {
        System.out.println("A");
    }
    public void close() {
        System.out.println("MyResource close");
    }
}
