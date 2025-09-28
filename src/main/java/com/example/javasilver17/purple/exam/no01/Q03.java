package com.example.javasilver17.purple.exam.no01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Item {
}

/**
 * Java Silver SE 17 紫本 模擬試験1 問3 の検証用クラスです。
 * <p>
 * このクラスは、{@link java.util.List} および {@link java.util.ArrayList} の
 * 様々なインスタンス化の方法を試し、どれがコンパイルに成功し、どれが失敗するかを示します。
 * <ul>
 * <li>ジェネリクスの正しい使い方</li>
 * <li>プリミティブ型とラッパークラスの違い</li>
 * <li>インタフェースの直接のインスタンス化ができないこと</li>
 * <li>raw型（生の型）の使用</li>
 * <li>{@code List.of()} や {@code Arrays.asList()} といったファクトリメソッドの特性</li>
 * </ul>
 * などのトピックについて学習することを目的としています。
 * </p>
 */
public class Q03 {
    /**
     * プログラムのエントリーポイント。
     * <p>
     * 様々なリストの定義を試し、その結果（インスタンスのクラス名など）を標準出力に出力します。
     * コンパイルエラーとなる行はコメントアウトされています。
     * </p>
     * 
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        // コンパイル成功するのはどの定義か？

        ArrayList<Integer> a = new ArrayList<>();
        // コンパイル成功
        ArrayList<String> b = new ArrayList<String>();
        // コンパイルエラー：ジェネリクスの型引数にはプリミティブ型は使用できない
        // ArrayList<double> c = new ArrayList<>();
        // コンパイル成功
        List<Item> d = new ArrayList<>();
        // コンパイルエラー：インターフェースはインスタンス化できない
        // List<String> e = new List<String>();
        // コンパイル成功：ジェネリクスの型引数を省略した場合、Object型になる
        List f = new ArrayList();
        // コンパイル成功
        List<Integer> g = List.of(1, 2, 3);
        // コンパイルエラー：Arrays.asListの戻り値はList<T>であり、ArrayList<T>ではない
        // ArrayList<Integer> h = Arrays.asList("1", "2", "3");

        System.out.println(a + ":" + g.getClass().getCanonicalName() + ":" + a.getClass().getName());
        System.out.println(b + ":" + g.getClass().getCanonicalName() + ":" + a.getClass().getName());
        // System.out.println(c + ":" + g.getClass().getCanonicalName() + ":" +
        // a.getClass().getName());
        System.out.println(d + ":" + g.getClass().getCanonicalName() + ":" + a.getClass().getName());
        // System.out.println(e + ":" + g.getClass().getCanonicalName() + ":" +
        // a.getClass().getName());
        System.out.println(f + ":" + g.getClass().getCanonicalName() + ":" + a.getClass().getName());
        System.out.println(g + ":" + g.getClass().getCanonicalName() + ":" + a.getClass().getName());
        // System.out.println(h + ":" + g.getClass().getCanonicalName() + ":" +
        // a.getClass().getName());
    }
}