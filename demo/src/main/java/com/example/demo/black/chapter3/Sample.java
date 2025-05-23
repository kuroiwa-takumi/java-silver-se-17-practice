package com.example.demo.black.chapter3;

public class Sample {
    private int num;
    public Sample(int num) {
        this.num = num;
    }

    public boolean equals(Sample obj) {
        if (this == obj) {
            return true;
        }
        return this.num == obj.num;
    }
}
