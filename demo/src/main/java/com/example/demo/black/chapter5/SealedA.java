package com.example.demo.black.chapter5;

public sealed class SealedA permits SealedB, NonSealedC, SealedSeeledD {
    String name;

    public SealedA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
