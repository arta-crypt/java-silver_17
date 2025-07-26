package com.example.javasilver17.purple.practice.test01;

import java.util.ArrayList;
import java.util.List;

/**
 * ジェネリクスとコレクションの使い方を確認するための練習問題クラスです。
 * <p>
 * ArrayListやListの宣言・初期化方法、ジェネリクスの型制約についてコメント付きで解説しています。
 */
public class Question03 {
    /**
     * コレクションの要素として利用するためのサンプルクラスです。
     */
    class Item {
    }

    /**
     * ジェネリクスとコレクションの宣言・初期化例を出力します。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String... args) {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<String>();
        // コンパイルエラー: ジェネリクスはプリミティブ型を使用できない
        // ArrayList<double> listC = new ArrayList<>();
        List<Item> listD = new ArrayList<>();
        // List<String> listE = new List<String>(); // インターフェースはインスタンス化できない
        List listF = new ArrayList<>();
        List<Integer> listG = List.of(1, 2, 3);
        // ArrayList<Integer> listH = Arrays.asList("1", "2", "3"); // コンパイルエラー: 型不一致

        System.out.println("Practice Test 01 Question 03");
        System.out.println("listA: " + listA + ", " + listA.getClass().getName());
        System.out.println("listB: " + listB + ", " + listB.getClass().getName());
        System.out.println("listD: " + listD + ", " + listD.getClass().getName());
        System.out.println("listF: " + listF + ", " + listF.getClass().getName());
        System.out.println("listG: " + listG + ", " + listG.getClass().getName());
    }
}
