package com.example.demo.black.chapter4.packageA;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        A a = main.new A();
        B b = main.new B();
        a.print();
        b.print();
    }

    public class A {
        public void print() {
            System.out.println("Hello from class A");
        }
    }

    public class B extends A {
        public void print() {
            super.print();
        }
    }
}
