package com.example.javasilver17.purple.exam.no02;

/**
 * <p>
 * 【模擬試験2 問5】<br>
 * 参照型（String, StringBuilder）の生成方法やintern(),
 * toString()の挙動、==による参照比較の結果を検証するサンプルです。
 * </p>
 */
public class Q05 {
    public static void main(String[] args) {
        String s1 = "Hello"; // 文字列リテラル。定数プールに格納される
        String s2 = new String("Hello"); // newで生成。異なる参照
        String s3 = s2.intern(); // intern()で定数プールの"Hello"参照を取得
        String s4 = s1.toString(); // toString()は同じインスタンスを返す
        StringBuilder sb1 = new StringBuilder(s1); // StringBuilderで新規生成
        String s5 = sb1.toString(); // 新しいStringインスタンス

        System.out.println(s1 == s2); // false: リテラルとnewは異なる参照
        System.out.println(s1 == s3); // true: intern()で同じ定数プール参照
        System.out.println(s1 == s4); // true: toString()は同じ参照
        System.out.println(s1 == s5); // false: StringBuilder→toString()は新規インスタンス
    }
}
