package com.example.javasilver17.purple.exam.no01;

/**
 * 紫本 第1章 問52
 * <p>
 * 変数宣言の有効性に関する問題。
 * コンパイルエラーとなる選択肢はコメントアウトされています。
 * </p>
 */
public class Q52 {
    /**
     * エントリポイントです。
     * <p>
     * さまざまな形式で変数を宣言し、コンパイルが通るものを標準出力に出力します。
     * </p>
     * @param args コマンドライン引数（使用しません）
     */
    public static void main(String[] args) {
        // 選択肢A
        String $_1 = "100";
        // 選択肢B
        // コンパイルエラー：ローカル変数にpublicは使えない。
        // public var x = "1_000_000".length();
        // 選択肢C
        final var y = Math.random();
        // 選択肢D
        int var = Integer.parseInt("100");
        // 選択肢E
        // コンパイルエラー：staticはローカル変数に使えない。
        // static final Integer INTVALUE = 1_000;
        // 選択肢F
        char VALUE = (char) 100.0F;
        // 選択肢G
        // コンパイルエラー：変数名にtrueは使えない。予約語のため。
        // boolean true = true;

        System.out.println($_1);
        // System.out.println(x);
        System.out.println(y);
        System.out.println(var);
        // System.out.println(INTVALUE);
        System.out.println(VALUE);
        // System.out.println(true);
    }
}