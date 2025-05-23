package com.example.demo.purple.chapter6;

public class Two extends One{
    String text;
    public Two (String text) {
        super(0); // これを呼ぶと、全ての親クラスのコンストラクタが呼ばれる
        this.text = text;
    }
    public String toString() {
        return super.toString() +  ", Two: " + text;
    }
}
