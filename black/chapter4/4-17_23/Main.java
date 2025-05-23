class Main {
    static {
        System.out.println("クラス初期化ブロックA");
    }

    public static void main(String[] args) {
        Main m = new Main();
        // 暗黙の型変換が発生するため、引数の型が一致しない
//        System.out.println(m.calc(10.0, 20));
        Person p = new Person("Alice", 23, "男性");
        System.out.println(p);

        Person p2 = Person.createMalePerson("Bob", 32);
        Person p3 = Person.createFemalePerson("Carol", 28);
    }

//    public static int calc (double a, int b) {
//        return (a + b) / 2;
//    }
//    public static int calc (int a, double b) {
//    return (a + b) / 2;
//}

    static class Person {
        private String name;
        private int age;
        private String gender;

        {
            System.out.println("インスタンス初期化ブロック");
        }

        static {
            System.out.println("クラス初期化ブロックB");
        }

        // コンストラクタをprivateにすることで、外部からのインスタンス生成を制限
        private Person(String name, int age, String gender) {
            super();
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public static Person createMalePerson(String name, int age) {
            return new Person(name, age, "男性");
        }

        public static Person createFemalePerson(String name, int age) {
            return new Person(name, age, "女性");
        }
    }

    static class Item {
        private String name;
        private int price;

        public Item() {
            this("Book", 1000);
        }

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }

    }
}



