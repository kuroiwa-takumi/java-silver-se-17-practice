public class Test {
    public int foo (int x, int y) {
        return x * y;
    }

    public int foo (int ... x) {
        int z = 0;
        for (int y : x) {
            z += y;
        }
        return z;
    }

    public void bar(Integer i) {
        System.out.print(i);
    }

    public void bar(float f) {
        System.out.print(f);
    }

    public void bar(String... s) {
        System.out.print(s.length);
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.print(t.foo(10, 2));
        t.bar(7);
        t.bar();
    }
}
