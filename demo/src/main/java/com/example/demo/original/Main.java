package com.example.demo.original;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        InnerClass inner = new Main().new InnerClass();
        inner.innerMethod();
    }

    class InnerClass {
        public void innerMethod() {
            System.out.println("This is an inner class method.");
        }
    }
}
