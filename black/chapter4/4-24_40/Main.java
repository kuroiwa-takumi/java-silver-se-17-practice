class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Sample sample = main.new Sample();
        Sample2 sample2 = new Sample2(5);
        System.out.println(sample2.x);

        System.out.println(sample2);
        System.out.println(sample2.hashCode());
        System.out.println(sample2.equals(sample));

        Test test = new Test("test", 100);
        test.hello();
        test.name();
        test.price();
        System.out.println(Test.value);

        User user = new User("John", "Smith");
    }

    public class Sample {
        private int x;

        public Sample() {
//            System.out.println("Sample");
            this(1); // 先頭に書かないとコンパイルエラー
        }

        public Sample(int x) {
            this.x = x;
            System.out.println(x);
        }
    }

    record Sample2(int x) {
    }
    // 引数がないrecordはコンパイルエラーにはならい
    record Sample3() {}

    //
    record Test(String name, int price) {
        public static String value = "test";
        public void hello() {
            System.out.println(this.name);
            System.out.println(this.price);
        }
    }

    record User(String id, String name) {
        // カスタムコンストラクタ：引数の型・数を合わせる！
        public User(String id, String name) {
            this.id = id;
            this.name = name;

            System.out.println(id);
            System.out.println(name);
        }
    }
}
