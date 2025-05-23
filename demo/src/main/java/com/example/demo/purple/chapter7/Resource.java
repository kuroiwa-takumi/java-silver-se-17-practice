package com.example.demo.purple.chapter7;

import java.io.IOException;

public class Resource implements AutoCloseable {
    String name;
    public Resource(String name) {
        this.name = name;
        System.out.println("Resource " + name + " created.");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Resource " + name + " closed.");
        throw new IOException();
    }
}
