public class Main {
    public static void main(String[] args) {
        // chapter3-22
        // chapter3-23
        // chapter3-24
        // chapter3-25

        // chapter3-26
        int a = 0;
        do {
            System.out.println(a++);
        } while (a < 5);

        // chapter3-27
        // {}の省略は直後の文1つのみ
        int i = 10;
        while (i < 20)
            System.out.println(i++);
        System.out.println("Hello"); // これはwhile文の外

        do
            System.out.println("Hello");
        // System.out.println("World"); コンパイルエラー
        while (false);

        // chapter3-28
        // for文
        // for (初期化式; 条件式; 更新式) {
        // 初期化式で同じデータ型の変数を宣言できる

        // 同じデータ型でないとコンパイルエラー
        // for (int i2 = 1, long j = 2; i < 5; i++) {
        // System.out.println(i);
        // }
        for (int i2 = 1, j = 2; i2 < 5; i2++) {
            System.out.println(i2 * j);
        }

        // chapter3-29
        // for文の初期化式で宣言した変数はfor文のブロック内で有効
        a = 1;
        for (int b = 2, total = 0; b <= 5; b++) {
            total += a * b;
            System.out.println(total); // ブロック内で有効
        }
        // System.out.println(total); // コンパイルエラー

        // chapter3-30
        for (int i3 = 0; i3 == 0; i3++) {
            System.out.println(i3);
        }

        for (int i4 = 0; test(i4); i4++) {
            System.out.println(i4);
        }

        // chapter3-31
        // 2つの条件式はカンマで同時に定義できない
        // NG for (int i6 = 0, int j = 0; i6 < 5; i6++, j++) {
        for (int i5 = 0, j = 0; i5 < 5; i5++, j++) {
            System.out.println(i5 + j);
        }

        // &&演算子で条件式を結合
        for (int i6 = 0, j = 0; i6 < 5 && j < 5; i6++, j++) {
            System.out.println(i6 + j);
        }

        // chapter3-32
        // 更新文は繰り返し処理がおわったあとに実行される
        for (int i7 = 0; i7 < 3; i7++, period()) {
            System.out.print(i7);
        }
        System.out.println();

        // chapter3-33
        // 10 を表示したい
        int array[][] = new int[][] { { 1, 2 }, { 2, 3, 4 } };
        int total = 0;
        for (int i8 = 0; i8 < array.length; i8++) {
            for (int j = i8; j < array[i8].length; j++) {
                total += array[i8][j];
            }
        }
        System.out.println(total);

        // 2重ループ
        for (int i9 = 0; i9 < 3; i9++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("***");
            }
        }
        System.out.println();

        // chapter3-34
        String[][] array2 = new String[2][];
        array2[0] = new String[2];
        array2[1] = new String[5];
        int i10 = 97;

        for (int a1 = 0; a1 < array2.length; a1++) {
            for (int b = 0; b < array2.length; b++) {
                array2[a1][b] = "" + i10;
                i10++;
            }
        }
        for (String[] tmp : array2) {
            for (String s : tmp) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        // chapter3-35
        // 無限ループ
        // while (true) {
        //     System.out.println("無限ループ");
        // }

        // 条件文と更新分は省略できる
        // for (;;) {
        //     System.out.println("無限ループ");
        // }
    }

    private static boolean test(int i) {
        System.out.println("i = " + i + ", i < 10 =" + (i < 10));
        return i < 10;
    }

    private static void period() {
        System.out.print(",");
    }
}
