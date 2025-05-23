public class Main12To21 {
    public static void main(String[] args) {
        // chapter3-13
        int num = 10;
        if (num <= 10)
            // if num <= 10
            System.out.println("numは10以下です");

        // chapter3-14
        if (false)
            System.out.println("実行されない");
        System.out.println("実行される");

        // chapter3-16
        num = 10;
        if (num == 100)
            System.out.println("A");
        else if (10 < num)
            System.out.println("B");
        else if (num == 10)
            System.out.println("C");
        else if (num == 10)
            System.out.println("D");

        // chapter3-17
        // switch文
        num = 1;

        // switchで使える型
        // 32ビット以下の整数型（byte, short, int, char）
        // ラッパークラス（Byte, Short, Integer, Character）
        // enum型
        // String型（Java7以降）

        switch (num) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("numの値は1でも2でもありません");
        }

        // chapter3-19
        num = 1;

        // フォールスルー、break文を書かないと次のcase文が実行される
        switch (num) {
            case 1:
            case 2:
            case 3:
                System.out.println("A");
            case 4:
                System.out.println("B");
            default:
                break;
        }

        // chapter3-20
        // defaultは最後に書かなくても良い
        num = 1;
        switch (num) {
            default:
                System.out.println("C");
            case 0:
                System.out.println("A");
                break;
            case 10:
                System.out.println("B");
        }

        // chapter3-21
        // switch式
        int a = 2;
        switch(a) {
            case 1 -> System.out.println("A");
            case 2 -> System.out.println("B");
            case 3 -> System.out.println("C");
            default -> System.out.println("C");
        }
    }
}
