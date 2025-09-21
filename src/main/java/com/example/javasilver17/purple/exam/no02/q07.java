package com.example.javasilver17.purple.exam.no02;

/**
 * <p>
 * 【模擬試験2 問7】<br>
 * StringとStringBuilderのメソッドの動作（replace,
 * substring）や、参照型の等価比較（equals）、ミュータブル・イミュータブルの違いを検証するサンプルです。
 * </p>
 */
public class Q07 {
    public static void main(String[] args) {
        String s = "Japan";
        StringBuilder sb = new StringBuilder("Japanese");

        // String#replaceは新しい文字列を返すが、sに再代入していないのでsは変化しない
        s.replace("pan", "va");

        // StringBuilder#substringは新しいStringを返すが、sb自体は変化しない
        sb.substring(0, 5);

        System.out.println("現在のsb: " + sb); // "Japanese"のまま

        // StringBuilder#replaceは自身の内容を書き換える（ミュータブル）
        sb.replace(2, 8, "va");
        System.out.println("現在のsb: " + sb); // "Java"

        // String#equals(Object)は型が異なると常にfalse
        System.out.println(s.equals(sb)); // false

        System.out.println("最終的なs: " + s); // "Japan"（変化なし）
        System.out.println("最終的なsb: " + sb); // "Java"
    }
}
