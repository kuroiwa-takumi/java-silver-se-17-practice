package com.example.demo.black.chapter6;

import java.io.IOException;

public class Resource implements AutoCloseable{
    String name;
    @Override
    public void close() throws IOException {
        System.out.println("Resource " + name + " closed.");
    }
}
