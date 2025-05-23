package com.example.demo.black.chapter3;


public class BlackDemoUsecaseChapter3 {

    public void execute() {
        // chapter3-6
        System.out.println("----------chapter3-6 Start----------");
        int a = 100, b = 20, c = 30;
        System.out.println("a % b :" + (a % b)); // 0
        System.out.println("a % b * c :" + (a % b * c)); // 0
        System.out.println("a / b :" + (a / b)); // 5
        System.out.println(a % b * c + a / b);
        System.out.println("----------chapter3-6 End----------");

        // chpter3-10
        System.out.println("----------chapter3-10 Start----------");
        Object a1 = new Sample(10);
        Object b1 = new Sample(10);
        System.out.println(a1.equals(b1)); // false

        Sample a2 = new Sample(10);
        Sample b2 = new Sample(10);
        System.out.println(a2.equals(b2)); // true
        System.out.println("----------chapter3-10 End----------");

        // chapter3-22
        System.out.println("----------chapter3-22 Start----------");
        String grade = switch (85 / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> null; // defalutは必須!
        };
        System.out.println(grade); // A
        System.out.println("----------chapter3-22 End----------");

        // chapter3-27
        System.out.println("----------chapter3-27 Start----------");
//        int a3 = 0;
//        while (a3 < 5)
//            do
//                a++;
//            while (a3 < 5);

//        System.out.println(a3); // 5
        System.out.println("----------chapter3-27 End----------");

        // chapter3-31
        System.out.println("----------chapter3-31 Start----------");
        // 条件式には複数条件は書けない
//        for (int i = 0, j1 = 0; i < 3, j1 < 5;i++, j1++) {
//            System.out.println("i:" + i + ", j:" + j);
//        }

        // 初期化式と更新式はカンマ区切りで複数書ける
        for (int i = 0, j = 0; i < 3; i++, j++) {
            System.out.println("i:" + i + ", j:" + j);
        }
        System.out.println("----------chapter3-31 End----------");

        // chapter3-32
        System.out.println("----------chapter3-32 Start----------");
        for (int i = 0; i < 3; i++, period()) {
            System.out.print(i);
        }
        System.out.println();

        int i1 = 10;
        for (;i1 < 10; i1++) {
            System.out.print(i1);
        }

        System.out.println("----------chapter3-32 End----------");

        // chapter3-38
        System.out.println("----------chapter3-38 Start----------");
        int num = 10;
        do {
            num++;
        } while (++num < 10);
        System.out.println(num); // 12

        int num1 = 10;
        while (num1++ <= 10) {
            num1++;
        }
        System.out.println(num1); // 13
        System.out.println("----------chapter3-38 End----------");

        // chapter3-39
        System.out.println("----------chapter3-39 Start----------");
        int [] arr = {1, 2, 3, 4, 5};
        int x = arr.length;
        int x1 = arr.length;

        // 54321と表示する
//        do {
//            x--; // 4, 3, 2, 1, 0, -1
//            System.out.print(arr[x]);
//        } while (0 <= x);

        while (0 < x) {
            x--; // 4, 3, 2, 1, 0
            System.out.println(arr[x]);
        }

        while (0 < x1) {
            System.out.println(arr[--x1]);
        }
        System.out.println("----------chapter3-39 End----------");

        // chapter3-40
        int total = 0;
        a: for (int i = 0; i < 5; i++) {
            b: for (int j = 0; j < 5; j++) {
                if (i % 2 == 0) continue a;
                if (3 < j) break b;
                total += j;
            }
        }
        System.out.println("total:" + total); // 0
        System.out.println("----------chapter3-40 End----------");
    }

    private void period() {
        System.out.print(",");
    }
}
