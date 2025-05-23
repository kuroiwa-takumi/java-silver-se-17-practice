class Main {
    public static void main(String[] args) {
        test("Hello");

        int result = calc(10, 20);
        System.out.println(result);

        // 受け取らなくてもいい
        calc(30, 40);

        // intをlongに代入可能
        long l = calc2(50, 60);
        System.out.println(l);

        int i = calc2(70, 80);
        Integer integer = calc2(70, 80);
        System.out.println(i);
        System.out.println(integer);

        float f = divide(10, 3);
        double d = divide(10, 3);
        System.out.println(f);
        System.out.println(d);

        // 可変長引数
        // いくつデータを渡すかわからない場合に使用
        System.out.println(calc(1, 2, 3, 4, 5));

        // より明確なシグネチャがある場合はそちらが優先される
        System.out.println(calc(1, 2));

    }

    // メソッド名 + 引数 = シグネチャ
    public static void test(String str) {
        System.out.println(str);
    }

    // voidなのに戻り値返そうとするとコンパイルエラー
    // 戻り値あるのに返さないとコンパイルエラー
    // 返そうとしている値が戻り値の型と違うとコンパイルエラー
    public static int calc (int a, int b) {
        // return; 呼び出し元に戻る
        return a + b;
    }

    public static int calc2 (int a, int b) {
        return a + b;
    }

    public static float divide (int a, int b) {
        return (float) a / (float) b;
    }

    // 可変長引数は引数の最後に指定
    public static int calc(int... values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        System.out.println("calc:可変長引数");
        return result;
    }
}

class Sample {
    static int num = 0;
}
