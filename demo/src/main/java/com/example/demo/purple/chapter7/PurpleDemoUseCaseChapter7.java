package com.example.demo.purple.chapter7;

public class PurpleDemoUseCaseChapter7 {

    public void execute() {

        // chpter7-2
        System.out.println("-----------------");
        try {
            System.out.println("try block executed.");
        } finally {
            // Handle any cleanup or finalization here
            System.out.println("finally block executed.");
        }

        // chapter7-4
        System.out.println("-----------------");
        String s = null;
        try {
          int i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        // chapter7-8
        System.out.println("-----------------");
        try {
            int a = Integer.parseInt("a");
        } catch (Exception e) {
//        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } finally {
            System.out.println("finally block executed.");
        }

        // chapter7-10
        System.out.println("-----------------");
        try (MyResource myResource = new MyResource()) {
            myResource.myMethod();
            System.out.println("try block executed.");
        } finally {
            System.out.println("finally block executed.");
        }

        // chapter7-11
        System.out.println("-----------------");
        Resource r1 = new Resource("r1");
        try(r1; Resource r2 = new Resource("r2")) {
            System.out.println("try block executed.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("finally block executed.");
        }
    }
}
