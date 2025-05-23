package com.example.demo.black.chapter5;

public interface Test {
    default void test() {
        test2();
    }

    static void test1() {
        System.out.println("test1");
    }

    public void test3();

    private void test2() {
        System.out.println("test2");
    }
}
