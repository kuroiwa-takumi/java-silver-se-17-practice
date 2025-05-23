package com.example.demo.purple.chapter6;

public record Item(String name, int stock) {
    // コンストラクタ
//    public Item(String name, int stock) {
//        this.name = name;
//        this.stock = stock > 0 ? stock : 0; // 在庫は0以上
//    }

    // コンパクトコンストラクタ
    public Item {
        stock = stock > 0 ? stock : 0; // 在庫は0以上
    }
}
