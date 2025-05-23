package com.example.demo;

import com.example.demo.black.chapter2.BlackDemoUsecaseChapter2;
import com.example.demo.black.chapter3.BlackDemoUsecaseChapter3;
import com.example.demo.black.chapter5.BlackDemoUsecase;
import com.example.demo.black.chapter6.BlackDemoUsecaseChapter6;
import com.example.demo.black.chapter7.BlackDemoUsecaseChapter7;
import com.example.demo.purple.chapter6.PurpleDemoUseCase;
import com.example.demo.purple.chapter7.PurpleDemoUseCaseChapter7;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        // chapter6
        System.out.println("----------purple Chapter 6 Start----------");
        PurpleDemoUseCase purpleDemoUseCase = new PurpleDemoUseCase();
        purpleDemoUseCase.demo();
        System.out.println("----------purple Chapter 6 End----------");
        System.out.println();
        System.out.println();

        // chapter7
        System.out.println("----------purple Chapter 7 Start----------");
        PurpleDemoUseCaseChapter7 purpleDemoUseCaseChapter7 = new PurpleDemoUseCaseChapter7();
        purpleDemoUseCaseChapter7.execute();
        System.out.println("----------purple Chapter 7 End----------");
        System.out.println();
        System.out.println();

        // black chapter2
        System.out.println("----------black Chapter 2 Start----------");
        BlackDemoUsecaseChapter2 blackDemoUsecaseChapter2 = new BlackDemoUsecaseChapter2();
        blackDemoUsecaseChapter2.execute();
        System.out.println("----------black Chapter 2 Start----------");
        System.out.println();
        System.out.println();

        // black chapter3
        System.out.println("----------black Chapter 3 Start----------");
        BlackDemoUsecaseChapter3 blackDemoUsecaseChapter3 = new BlackDemoUsecaseChapter3();
        blackDemoUsecaseChapter3.execute();
        System.out.println("----------black Chapter 3 End----------");
        System.out.println();
        System.out.println();

        // black chapter5
        System.out.println("----------black Chapter 5 Start----------");
        BlackDemoUsecase blackDemoUsecase = new BlackDemoUsecase();
        blackDemoUsecase.execute();
        System.out.println("----------black Chapter 5 Start----------");
        System.out.println();
        System.out.println();

        // black chapter6
        System.out.println("----------black Chapter 6 Start----------");
        BlackDemoUsecaseChapter6 blackDemoUsecaseChapter6 = new BlackDemoUsecaseChapter6();
        blackDemoUsecaseChapter6.execute();
        System.out.println("----------black Chapter 6 End----------");
        System.out.println();
        System.out.println();

        // black chapter7
        System.out.println("----------black Chapter 7 Start----------");
        BlackDemoUsecaseChapter7 blackDemoUsecaseChapter7 = new BlackDemoUsecaseChapter7();
        blackDemoUsecaseChapter7.execute();
        System.out.println("----------black Chapter 7 End----------");
        System.out.println();
        System.out.println();

    }

}
