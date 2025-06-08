package com.example.javasilver17.knowledge.tostring;

/**
 * ToStringの挙動について学習するためのクラス。
 * 
 * このクラスは、ToStringの基本的な挙動を確認するためのサンプルコードを提供する。
 * 
 * @author 作成者名
 * @version バージョン番号
 * @since 作成日
 */
public class ToString {
    /**
     * mainメソッド。
     * 
     * このメソッドは、ToStringの挙動を確認するためのサンプルコードを実行する。
     * 
     * @param args コマンドライン引数
     */
    public static void main(String... args) {
        // 配列を生成する
        var array = new int[] { 1, 2, 3 };

        // 配列のToString()メソッドを呼び出し、文字列表現を取得する
        // ただし、配列のToString()メソッドは、配列オブジェクトのハッシュコードを返すだけなので、
        // 配列の内容は表示されない。
        System.out.println(array); // 配列オブジェクトのハッシュコードを表示する

        // 配列のToString()メソッドを呼び出し、文字列表現を取得する
        // ただし、配列のToString()メソッドは、配列オブジェクトのハッシュコードを返すだけなので、
        // 配列の内容は表示されない。
        System.out.println(array.toString()); // 配列オブジェクトのハッシュコードを表示する

        // 配列のクラス名を取得する
        System.out.println(array.getClass().getCanonicalName()); // 配列のクラス名を表示する

        // 配列のハッシュコードを取得する
        System.out.println(System.identityHashCode(array)); // 配列のハッシュコードを表示する

        // 配列のハッシュコードを16進数で取得する
        System.out.println(Integer.toHexString(System.identityHashCode(array))); // 配列のハッシュコードを16進数で表示する
    }
}