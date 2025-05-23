public class Test {
    String text = "A";

    void method() {
        text = "B"; // 代入
    }

    void method(String t) {
        String text = "C";
        System.out.println(text);
    }

    public static void main(String[] args) {
        String text = "D";
        Test t = new Test();
        // インスタンス生成すればインスタンスメンバを参照できる
        t.method("E");
        System.out.println(t.text);
        t.method();
        System.out.println(text);
        System.out.println(t.text);
    }
}
