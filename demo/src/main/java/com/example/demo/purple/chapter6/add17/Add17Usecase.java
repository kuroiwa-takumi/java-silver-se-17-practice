package com.example.demo.purple.chapter6.add17;

public class Add17Usecase {
    public void execute() {
        test(new Two());
    }
    void test(Object o) {
        if (o instanceof X) {
            System.out.println("X");
        }
        if (o instanceof Zero zero) {
            System.out.println("Zero");
        }
        if (o instanceof One one) {
            System.out.println("One");
        }
    }
}
