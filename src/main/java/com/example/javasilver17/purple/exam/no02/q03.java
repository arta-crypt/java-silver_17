package com.example.javasilver17.purple.exam.no02;

/**
 * <p>
 * 【模擬試験2 問3】<br>
 * Javaの基本データ型・ラッパークラス・型変換に関する仕様を検証するためのサンプルクラスです。
 * </p>
 * <ul>
 * <li>byte, short, int, Integer, Double
 * などの型宣言や代入、キャスト、演算結果の型について、各選択肢ごとにコメントで解説しています。</li>
 * <li>どの宣言がコンパイル可能か、どの宣言がエラーになるかを明確に示しています。</li>
 * <li>模擬試験2の問3の解説・検証用コードです。</li>
 * </ul>
 */
public class Q03 {
    public static void main(String... args) {
        // 選択肢A：問題なし
        byte A_b = 0b0100;
        // 選択肢B：コンパイルエラー。 byte型の変数に200は代入できない。
        // byte B_b = 200;
        // 選択肢C：問題なし
        short C_s = (short) 300;
        // 選択肢D：コンパイルエラー。 byte型とshort型の演算結果はint型になる。
        // short D_s = b1 + s1;
        // 選択肢E：問題なし
        Integer E_I = (int) 10.0;
        // 選択肢F：コンパイルエラー。基本データ型とラッパークラスの間では暗黙の型変換は行われない。
        // Double F_D = 20.0F;

        System.out.println("A_b=" + A_b);
        System.out.println("C_s=" + C_s);
        System.out.println("E_I=" + E_I);
    }
}
