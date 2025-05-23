package com.example.demo.purple.chapter6;

public interface Browser {
    default void browse() {
        System.out.println("Browsing...");
    }
}
