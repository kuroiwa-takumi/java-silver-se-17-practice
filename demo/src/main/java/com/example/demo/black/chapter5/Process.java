package com.example.demo.black.chapter5;

public interface Process {
    void execute();

    static Process getInstance() {
        return new SampleProcess();
    }
}
