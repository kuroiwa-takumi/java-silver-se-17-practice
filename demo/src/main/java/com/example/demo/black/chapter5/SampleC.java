package com.example.demo.black.chapter5;

public class SampleC implements SampleB {
    @Override
    public void sample() {
        // SampleAのメソッドを呼び出す
//        SampleA.super.sample(); エラー
        System.out.println("Java");
    }
}
