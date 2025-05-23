package com.example.demo.black.chapter2;

public class Item {
    private String name;
    private int price;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Item) {
            Item item = (Item) obj;
            return this.name.equals(item.name);
        }
        return false;
    }
    public String getName() {
        return name;
    }
}
