package com.example.javasilver17.black.exam.no02;

/**
 * <p>
 * 問24: instanceofのパターンマッチを利用した型判定とスコープの動作確認用クラス。
 * </p>
 * <ul>
 * <li>testメソッドでObject型引数がString型かどうかを判定し、String型なら小文字変換、そうでなければtoString()の結果を返す。</li>
 * <li>パターンマッチfor instanceofによる変数宣言のスコープも確認できる。</li>
 * </ul>
 */
public class q24 {

    /**
     * 動作確認用のエントリーポイント。
     * 
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        System.out.println(test("A"));
    }

    /**
     * 引数objがString型の場合は小文字に変換して返し、
     * それ以外の場合はtoString()の結果を返す。
     * 
     * @param obj 任意のオブジェクト
     * @return String型なら小文字変換、そうでなければtoString()の結果
     */
    public static String test(Object obj) {
        String s = "";
        if (!(obj instanceof String str)) {
            s = obj.toString();
        } else {
            s = str.toLowerCase();
        }
        return s;
    }
}
