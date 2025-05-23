package com.example.demo.black.chapter5;

public interface SampleA {
    default void sample() {
        System.out.println("Hello");
    }
}
