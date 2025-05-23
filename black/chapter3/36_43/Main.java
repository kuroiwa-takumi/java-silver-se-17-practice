import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // chapter3-36
        String[][] array = { { "A", "B", "C" } };
        for (Object obj : array) {
            System.out.println(obj);
        }

        int[] array2 = { 1, 2, 3, 4, 5 };

        for (int i : array2) {
            System.out.println(i);
        }

        // chapter3-37
        int[] array3 = { 1, 2, 3 };

        for (int i : array3) {
            System.out.println(i);
            i = i * 10;
        }

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add(null);

        for (String str : list) {
            if (str == null) {
                continue;
            }
            System.out.println(str);
        }

        // chapter3-40
        // break文: ループを抜ける
        String[] array4 = { "A", "B" };

        for (String a : array4) {
            for (String b : array4) {
                if ("B".equals(b))
                    break;
                System.out.print(b);
            }
        }

        // chapter3-41
        // continue文: ループの次の繰り返しに移る
        int[] array5 = { 1, 2, 3, 4, 5 };
        int total = 0;
        for (int i : array5) {
            if (i % 2 == 0)
                continue;
            total += i;
        }
        System.out.println(total);

        // chapter3-42
        int num = 9;

        a: {
            if (num < 10) {
                break a;
            }
            System.out.println("Hello");
        }
        System.out.println("World");

        // chapter3-43
        int total2 = 0;
        a: for (int i = 0; i < 5; i++) {
            b: for (int j = 0; j < 5; j++) {
                if (i % 2 == 0)
                    continue a;
                if (3 < j)
                    break b;
                total2 += j;
            }
        }
        System.out.println(total2);
    }
}
