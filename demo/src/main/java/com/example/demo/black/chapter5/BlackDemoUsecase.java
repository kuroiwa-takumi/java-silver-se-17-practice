package com.example.demo.black.chapter5;

public class BlackDemoUsecase {
    public void execute() {
        // 5-1
        System.out.println("-----------------");
        ClassB classB = new ClassB();
        classB.hello();
        classB.bye();

        // 5-4
        System.out.println("-----------------");
        SampleClass sampleClass = new SampleClass();
        sampleClass.hello(); // オーバーライドしたもの
        sampleClass.sayHello();

        // 5-6
        System.out.println("-----------------");
        SampleA a = new SampleC();
        a.sample();

        // 5-7
        System.out.println("-----------------");
        Process p = Process.getInstance();
        p.execute();

        AbstractProcess abstractProcess = new SampleProcess();
        abstractProcess.perform();

        // 5-12
        System.out.println("-----------------");
        SampleA1 a1 = new SampleA1();
        SampleA1 b1 = new SampleB1();
        System.out.println(a1.val);
        System.out.println(b1.val);
        a1.print();
        b1.print();

        // 5-13
        System.out.println("-----------------");
        Worker worker = new Engineer();
        worker.work();

        // 5-14
        System.out.println("-----------------");
        SampleA2 a2 = new SampleB2();
        a.sample();

        // 5-16
        System.out.println("-----------------");
        ClassA classA = new ClassB();
        ClassB classB1 = (ClassB) classA;
        classB1.hello();

        ClassA classA1 = new ClassA();
//        ClassB classB2 = (ClassB) classA1;

        // 5-19
        System.out.println("-----------------");
        Child child = new Child();
        child.name = "child";
        System.out.println(child.getName());

        // 5-22
        System.out.println("-----------------");
        Test test = new Test2();
        test.test();
        Test.test1();
        test.test3();
    }
}
