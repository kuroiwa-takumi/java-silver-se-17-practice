import java.util.ArrayList;

public class Main1To11 {
    public static void main(String[] args) {
        // chapter3-1
        int a = 3;
        int b = a += 5; // a = a + 5
        System.out.println(a + b); // 16

        int c = 3;
        int d = a = b = c;

        // 右から左へ代入される
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // chapter3-2
        // 型変換のお話
        long l = 100; // 暗黙の型変換
        System.out.println(l); // 100

        int i = (int) 10L; // 明示的な型変換
        System.out.println(i); // 10

        int a1 = 10;
        long b1 = 20L;
        var c1 = a1 + b1; // long型になる
        System.out.println(c1); // 30

        byte a2 = (byte) 0b10000000; // byte型の最大値
        System.out.println(a2); // -128

        short b2 = 128 + 128; // 256はshortの範囲内である為、コンパイルエラーにならない
        System.out.println(b2); // 256

        // int c2 = 2 * 3L;
        int c2 = 2 * (int) 3L; // 明示的な型変換が必要
        System.out.println(c2); // 6

        // float d2 = 10.0;
        float d2 = (float) 10.0; // 明示的な型変換が必要 
        System.out.println(d2); // 10.0

        // chapter3-3
        int a3 = 10;
        int b3 = a3++ + a + a-- - a-- + ++a;
        System.out.println(b3); // 32

        a3 = 10;
        int result = a3++ + ++a3;
        System.out.println(result); // 22

        // chapter3-4
        int a4 = 10;
        int b4 = 20;
    
        // 全部使える
        System.out.println(a4 == b4);
        System.out.println(a4 != b4);
        System.out.println(a4 < b4);
        System.out.println(a4 <= b4);
        System.out.println(a4 > b4);
        System.out.println(a4 >= b4);

        boolean test1 = true;
        boolean test2 = true;

        // ==しか使えない
        System.out.println(test1 == test2);
        
        // chapter3-5
        int a5 = 10;
        int b5 = 10;

        // 10 < 10 はfalseなので、左辺のみ評価される
        // ショートサーキット評価
        if (10 < a5 && 10 < ++b5) {
            a5++;
        }
        System.out.println(a5 + b5); // 20

        // chapter3-6
        int a6 = 100, b6 = 20, c6 = 30;
        System.out.println(a6 % b6 * c6 + a6 / b6);

        // chapter3-8
        Object a8 = new Object();
        Object b8 = a8;

        // 同じオブジェクトを参照しているのでtrue
        System.out.println(a8 == b8); // true

        a8 = new Object();

        // オブジェクトが異なるのでfalse
        // new Object()は異なるオブジェクトを生成する
        System.out.println(a8 == b8); // false

        // chapter3-9
        Sample s91 = new Sample(10, "a");
        Sample s92 = new Sample(10, "b");
        System.out.println(s91.equals(s92)); // true

        // chapter3-10
        Sample2 s101 = new Sample2(10);
        Sample2 s102 = new Sample2(10);

        // インスタンスが異なるのでfalse
        // Objectクラスのequalsメソッドはインスタンスが異なる場合はfalseを返す
        System.out.println(s101.equals(s102)); // false

        // chapter3-11
        s102 = null;

        // nullとの比較はfalse
        System.out.println(s101.equals(s102));
    }

    // chapter3-9
    static class Sample {
        private int num;
        private String name;

        public Sample(int num, String name) {
            this.num = num;
            this.name = name;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj instanceof Sample) {
                Sample s = (Sample) obj;
                return s.num == this.num;
            }
            return false;
        }
    }

    // chapter3-10
    static class Sample2 {
        private int num;
      
        public Sample2(int num) {
            this.num = num;
        }
    }
}
