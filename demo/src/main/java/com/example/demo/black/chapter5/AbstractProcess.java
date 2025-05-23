package com.example.demo.black.chapter5;

public abstract class AbstractProcess implements Process {
    @Override
    public void execute() {
        // 処理の実行
        System.out.println("start");
        perform();
        System.out.println("end");
    }

    // 抽象メソッド
    protected abstract void perform();
}
