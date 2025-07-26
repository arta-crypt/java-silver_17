package com.example.javasilver17.purple.practice.test01;

/**
 * 参照型の出力結果について確認するための練習問題クラスです。
 * <p>
 * 配列やオブジェクトをSystem.out.printlnで出力した際の表示内容を確認します。
 */
public class Question05 {
    /**
     * 参照型の配列を出力し、表示結果を確認するメインメソッドです。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        main(new Question05(), args);

        // 参照型配列の出力例
        int[][] array1 = new int[2][3];
        System.out.println(array1);
    }

    /**
     * Question05インスタンスと可変長引数を出力するメソッドです。
     *
     * @param q Question05のインスタンス
     * @param s 可変長引数（String型）
     */
    public static void main(Question05 q, String... s) {
        System.out.println(q + ", " + s);
    }
}
