package com.example.javasilver17.knowledge.classname;

/**
 * {@code ClassName} クラスは、配列オブジェクトのクラス名取得に関する
 * 各種メソッドの挙動を確認するためのサンプルクラスです。
 * <p>
 * 主に {@link Class#getCanonicalName()}、{@link Class#getSimpleName()}、
 * {@link Class#getName()} の違いを出力します。
 * </p>
 *
 * @author 作成者
 */
public class ClassName {
    /**
     * 配列オブジェクトのクラス名取得方法を標準出力に表示します。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String... args) {
        // int型配列を生成
        var array = new int[] { 1, 2, 3 };

        // getCanonicalName(): 配列の完全修飾名（例: int[]）
        System.out.println(array.getClass().getCanonicalName());

        // getSimpleName(): クラスの単純名（例: int[]）
        System.out.println(array.getClass().getSimpleName());

        // getName(): 内部表現のクラス名（例: [I）
        System.out.println(array.getClass().getName());

        // 空のint配列のクラス名（getCanonicalName()の挙動確認）
        System.out.println(new int[0].getClass().getCanonicalName());

        // Class型で配列クラスを取得し、クラス名を表示
        Class clazz1 = new int[0].getClass();
        System.out.println(clazz1.getCanonicalName());

        // ジェネリクスを使って配列クラスを取得し、クラス名を表示
        Class<int[]> clazz2 = int[].class;
        System.out.println(clazz2.getCanonicalName());
    }
}
