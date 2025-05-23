package com.example.demo.purple.chapter6;

public interface Test1 {
    String TEST_NAME = "Test";
    double TEST_VALUE = 5.0;

    static double calc() {
        return TEST_VALUE * TEST_VALUE;
    }
}
