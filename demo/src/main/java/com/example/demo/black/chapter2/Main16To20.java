package com.example.demo.black.chapter2;

public class Main16To20 {
    public static void main(String[] args) {
        // chapter2-16
        String str = "abcde";
        System.out.println(str.substring(1, 3).startsWith("b")); // true

        // chapter2-17
        // Stringのconcatメソッドは、文字列を連結する
        String str1 = "Hello, ".concat("World!");
        System.out.println(str1); // Hello, World!

        // chapter2-18
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb.capacity()); // 21

        // chapter2-19
        StringBuilder sb2 = new StringBuilder();
        sb2.append("abcde");
        sb2.reverse(); // edcba
        System.out.println(sb2);
        sb2.replace(1, 3, "a"); // 1-3の範囲をaに置換!!
        System.out.println(sb2); // eaba

        // chapter2-20
        StringBuilder sb3 = new StringBuilder("abcde");
        System.out.println(sb3.indexOf("bcd")); // 1
    }
}
