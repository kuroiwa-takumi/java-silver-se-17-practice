package com.example.demo.purple.chapter6;

public class Tomato extends Vegetable{
    public Tomato(int id) {
        super(id); // これを呼ぶと、全ての親クラスのコンストラクタが呼ばれる
        System.out.println("Tomato");
    }
}
