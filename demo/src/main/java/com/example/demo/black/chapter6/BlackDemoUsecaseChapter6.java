package com.example.demo.black.chapter6;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackDemoUsecaseChapter6 {
    public void execute() {
        try {
            int num = Integer.parseInt(null);
            System.out.println("num = " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
        // chapter6-5
        System.out.println("-----------------");
        System.out.println(test(null));

        // chapter6-6
        System.out.println("-----------------");
        System.out.println(sample());

        // chapter6-7
        System.out.println("-----------------");
        System.out.println(sample2());

        // chapter6-11
        System.out.println("-----------------");
        try {
            hello(null);
        } catch (SampleException e) {
            System.out.println("SampleException: " + e.getMessage());
        } finally {
            System.out.println("finally");
        }

        // chapter6-14
        List<String> list = new ArrayList<>();
//        list.get(0); // IndexOutOfBoundsException

        // chapter6-20
        System.out.println("-----------------");
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.next();
            System.out.println("str = " + str);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("finally");
        }

        // chapter6-21
        System.out.println("-----------------");
        Resource resource = new Resource();
        Resource resource2 = new Resource();
        try (resource; resource2) {
            resource.name = "Resource1";
            resource2.name = "Resource2";
            System.out.println("try block executed.");
        } catch (IOException e) {
            System.out.println("TestException: " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }

    private String test(Object o) {
        try {
            System.out.println(o.toString());
        } catch (NullPointerException e) {
            return "A";
        } finally {
            System.out.println("finally");
        }
        return "C";
    }

    private int sample() {
        try {
            throw new Exception();
        } catch (Exception e) {
            return 10;
        } finally {
            return 20;
        }
    }

    private int sample2() {
        int val = 0;
        try {
            String[] array = {"A", "B", "C"};
            System.out.println(array[3]);
        } catch (RuntimeException e) {
            val = 10;
            return val;
        } finally {
            val += 10;
        }
        return val;
    }

    private void hello(String name) throws SampleException{
        if (name == null) {
            throw new SampleException();
        }
        if ("".equals(name)) {
            throw new TestException();
        }
    }
}
