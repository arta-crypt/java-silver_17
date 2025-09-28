package com.example.javasilver17.purple.exam.no01;

/**
 * Java Silver SE 17 紫本 模擬試験1 問17 の検証用クラスです。
 * <p>
 * このクラスは、伝統的な for ループの初期化式で {@code var} を使用できることを示します。
 * ループカウンター変数が {@code var} で宣言されても、型が正しく推論され、
 * ループが正常に機能することを確認します。
 * </p>
 */
public class Q17 {
    /**
     * プログラムのエントリーポイント。
     * <p>
     * {@code var} を使用してループカウンターを宣言し、char配列の要素を
     * 標準出力に出力します。
     * </p>
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        // for文内でvarを使うサンプル
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (var v = 0; v < vowels.length; v++) {
            System.out.print(vowels[v]);
        }
    }
}