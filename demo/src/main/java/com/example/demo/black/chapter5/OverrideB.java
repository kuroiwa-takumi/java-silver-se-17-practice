package com.example.demo.black.chapter5;

public class OverrideB extends OverRideA{
    @Override
    public SampleImpl getSample() {
        return new SampleImpl();
    }
}
