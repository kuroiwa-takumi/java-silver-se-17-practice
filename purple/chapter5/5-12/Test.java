class Test {
    static int x;
    static int y;

    Test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Test t = new Test(10, 20);
        System.out.println(t.x + " " + t.y);
    }
}
