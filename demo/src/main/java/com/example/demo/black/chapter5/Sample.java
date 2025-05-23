package com.example.demo.black.chapter5;

public interface Sample {
    void hello();

    default void sayHello() {
        System.out.println("Hello from Sample");
    }
}
