class Main {
    public static void main(String[] args) {
        Object obj = null;
        System.out.println(obj);

        Sample sample = new Sample();
        Sample s2 = new Sample();

        Sample.num = 10;
        s2.num = 30; // static領域にあるstaticメンバーはグローバルな値
        // コンパイル上は、Sample.num = 30 に読み替えられるよ！
        System.out.println(Sample.num);
    }
}

class Sample {
    static int num = 0;
}
