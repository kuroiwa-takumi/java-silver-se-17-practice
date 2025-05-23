package com.example.demo.black.chapter2;

import java.util.ArrayList;

public class BlackDemoUsecaseChapter2 {

    public void execute() {
        // chapter2-8
        System.out.println("----------chapter2-8 Start----------");
        execute8();
        System.out.println("----------chapter2-8 End----------");

        // chapter2-25
        System.out.println("----------chapter2-25 Start----------");
        String a = new String("sample");
        String b = "sample";
        System.out.println(a == b); // false, 参照先のアドレスを比較する
        System.out.println(a.equals(b)); // true
        System.out.println("----------chapter2-25 End----------");

        // chapter2-26
        System.out.println("----------chapter2-26 Start----------");
        String c = "abc";
        String d = new String(c);

        int count = 0;
        if (c.intern() == "abc") {
            count++;
        }
        if (d.intern() == "abc") {
            count++;
        }
        if (c.intern() == d.intern()) {
            count++;
        }
        System.out.println(count); // 3
        // c.intern()はコンスタントプールから"abc"を探して、見つかったらその参照を返す
        // d.intern()はコンスタントプールから"abc"を探して、見つかったらその参照を返す
        // もし見つからなかったら、コンスタントプールに"abc"を追加して、その参照を返す
        // つまり、c.intern()とd.intern()は同じ参照を返す
        // ただし、d.intern()はコンスタントプールに"abc"を追加するので、メモリを消費する
        // c.intern()はコンスタントプールに"abc"があるので、参照を返すだけ
        // そのため、c.intern()はメモリを消費しない
        System.out.println("----------chapter2-26 End----------");

        // chapter2-41
        System.out.println("----------chapter2-41 Start----------");
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("A", 100));
        items.add(new Item("B", 200));
        items.add(new Item("C", 300));
        items.add(new Item("A", 100));
        items.remove(new Item("A", 500)); // removeメソッドは、equalsメソッドを使って比較する
        for (Item item : items) {
            System.out.println(item.getName());
        }
        System.out.println("----------chapter2-41 End----------");

        // chapter2-42
        System.out.println("----------chapter2-42 Start----------");
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        for (String item : list) {
            if (item.equals("B")) {
                list.remove(item); // Cが繰り上がる,remove直後にループ終了
            } else {
                System.out.println(item);
            }
        }
        // 拡張for文で要素を削除すると、カーソルがそのまま
        // A, B, C → A, C
        // Cは出力されない
        System.out.println("----------chapter2-42 End----------");

        // chapter2-43
        System.out.println("----------chapter2-43 Start----------");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");
        for (String item : list2) {
//            if (item.equals("C")) {
//                list2.remove(item); // ConcurrentModificationException
//            } else {
//                System.out.println(item);
//            }
            // なぜ"D"だとエラーにならないのか
            // "C"を削除した後、次の要素"D"を取得しようとすると、ConcurrentModificationExceptionが発生する
            // しかし、"D"を削除した後、次の要素"E"を取得しようとすると、ConcurrentModificationExceptionは発生しない
            if (item.equals("D")) {
                list2.remove(item); // ConcurrentModificationException
            } else {
                System.out.println(item);
            }
        }
        for (String item : list2) {
            System.out.println(item);
        }
        // java.util.ConcurrentModificationException
        // for (String item : list2) {
        // System.out.println(item);
        // }
        System.out.println("----------chapter2-43 End----------");
    }

    public void execute8() {
        var b = new Chapter2To8B();
        b.test();
        var a = (Chapter2To8A) b;
        a.test();
//        b = new Chapter2To8C(); // 互換性がないのでエラー
        var c = new Chapter2To8C();
        c.test();
        var a2 = (Chapter2To8A) c;
        a2.test();
    }
}
