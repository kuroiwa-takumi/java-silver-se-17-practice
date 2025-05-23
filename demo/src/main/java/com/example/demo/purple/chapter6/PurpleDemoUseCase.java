package com.example.demo.purple.chapter6;

import com.example.demo.purple.chapter6.add17.Add17Usecase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PurpleDemoUseCase {
    public void demo() {
        // 6-2
        System.out.println("-----------------");
        Middle middle = new Bottom();
        middle.update();
        System.out.println(middle.x + ":" + middle.y);

        // 6-6
        System.out.println("-----------------");
        Parent object = new Child();
        Child.methodA(); // static method
        // object.methodB(); // instance method, will not compile
        object.methodC();

        // 6-7
        System.out.println("-----------------");
        new Tomato(1);

        // 6-8
        System.out.println("-----------------");
        System.out.println(new One(1));
        System.out.println(new Two("Two"));

        // 6-10
        System.out.println("-----------------");
        Item item = new Item("Duke", -100);
        System.out.println(item);

        // 6-15
        System.out.println("-----------------");
        TestImpl testImpl = new TestImpl();
        System.out.println(Test1.TEST_NAME + ":" + Test1.calc());

        // 6-17
        System.out.println("-----------------");
        Add17Usecase add17Usecase = new Add17Usecase();
        add17Usecase.execute();

        // 6-18
        System.out.println("-----------------");
        Browser browser = new MobilePhone();
        browser.browse();
        browser = new Laptop();
        browser.browse();
//        MobilePhone mp = (MobilePhone) browser; // ClassCastException
//        mp.call();

        // 6-20
        System.out.println("-----------------");
        ArrayList<Item2> items = new ArrayList<>();
        items.add(new Item2(1, "Laptop"));
        items.add(new Item2(2, "Mobile"));
        items.add(new Item2(2, "Phone"));
        for (Item2 item2 : items) {
            System.out.print(item2.no() + ", ");
        }
        System.out.println(items.set(1, new Item2(3, "SmartWatch")));

        // 6-21
        System.out.println("-----------------");
        List<Integer> numnbers = new ArrayList<>();
        numnbers.add(1);
        numnbers.add(2);
        numnbers.add(1,3);
        System.out.println(numnbers);
        System.out.println(numnbers.size());
        System.out.println(numnbers.remove(1));

        // 6-22
        System.out.println("-----------------");
        Map<String, String> map = new HashMap<>();
        map.put("UK", "United Kingdom");
        map.put("US", "United States");
        map.put("JP", "Japan");
        System.out.println(map);
    }
}
