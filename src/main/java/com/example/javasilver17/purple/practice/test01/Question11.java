package com.example.javasilver17.purple.practice.test01;

/**
 * 2次元配列とデータ型に関する動作確認のための練習問題クラスです。
 * <p>
 * 配列の初期化方法や、異なるデータ型の扱い、System.out.printlnによる出力結果を確認します。
 */
public class Question11 {
    /**
     * 2次元配列の宣言・初期化とデータ型の違いによる動作を確認するメインメソッドです。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        int[][] a = { { -1, 0, 1 }, { 'A', 'B', 'C' } };
        // boolean b = new Boolean[][]; // コンパイルエラー: new Boolean[][]は不正な初期化
        // 配列の初期化子（{ ... }）を使う場合は、配列のサイズ（new char[3][3]）を同時に指定できません。
        // char[][] c = new char[3][3] { { '1', '2', '3' }, { 'A', 'B', 'C' } };
        // Math.floor(3.14) は double型を返しますが、Math.round(3.14) は long型を返します。
        // Double[][] d = { { 0.1, 0.1e-2 }, { Math.floor(3.14), Math.round(3.14) } };
        char e[][] = new char[1][1];
        e[0][0] = (char) 100;
        Object[][] f = { {}, { "Java", 17 } };

        System.out.println("a: " + a + ", " + a.getClass().getSimpleName());
        System.out.println("e: " + e + ", " + e.getClass().getSimpleName());
        System.out.println("f: " + f + ", " + f.getClass().getSimpleName());
    }
}
