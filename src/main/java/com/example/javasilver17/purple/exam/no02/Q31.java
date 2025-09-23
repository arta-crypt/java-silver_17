/**
 * Java Silver SE 17 紫本 模擬試験 No.2 問31
 * <p>
 * {@link java.util.ArrayList}の各メソッドの動作（特に戻り値）を確認するサンプルコードです。
 * {@code add}, {@code set}, {@code get}, {@code remove} メソッドの挙動と戻り値について示します。
 * </p>
 */
package com.example.javasilver17.purple.exam.no02;

import java.util.ArrayList;

/**
 * Java Silver SE 17 紫本試験問題 第2章 問31のサンプルプログラムです。
 * {@link ArrayList}クラスの要素の追加、置換、取得、削除の機能と、それらのメソッドの戻り値について学習します。
 */
public class Q31 {
    /**
     * ArrayListの操作を実行するメインメソッドです。
     * 
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Duke ");
        list.add("James ");
        list.add(null);

        // コンパイルエラー。戻り値がvoidのため。
        // var value1 = list.add(0, "Carol");
        // System.out.println(value1);

        // setメソッドは、指定された位置に以前あった要素を返す
        var value2 = list.set(1, "Amy ");
        System.out.println(value2);

        // getメソッドは、指定された位置にある要素を返す
        var value3 = list.get(2);
        System.out.println(value3);

        // removeメソッドは、リストから削除された要素を返す
        // 存在しないインデックスの要素を削除しようとするとIndexOutOfBoundsExceptionが発生する
        // list.add(0, "Carol")がコメントアウトされているため、サイズは3
        // var value4 = list.remove(3);
        var value4 = list.remove(2);
        System.out.println(value4);

        for (String string : list) {
            System.out.println(string);
        }
    }
}