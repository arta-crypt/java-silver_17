package com.example.javasilver17.knowledge.initializerblock;

/**
 * 初期化ブロックの挙動について学習するためのクラス。
 * 
 * このクラスは、静的初期化ブロックとインスタンス初期化ブロックの基本的な挙動を確認するためのサンプルコードを提供する。
 * 
 * @author 作成者名
 * @version バージョン番号
 * @since 作成日
 */
public class InitializerBlock {
    /**
     * 静的フィールド
     */
    static int i;

    /**
     * インスタンスフィールド
     */
    String s;

    /**
     * 静的初期化ブロック
     * 
     * このブロックは、クラスが初期化される際に実行される。
     */
    static {
        i = 10; // 静的初期化ブロック
        System.out.println("Static initializer block executed, i = " + i);
    }

    /**
     * インスタンス初期化ブロック
     * 
     * このブロックは、インスタンスが生成される際に実行される。
     */
    {
        s = "Hello, World!"; // インスタンス初期化ブロック
        System.out.println("Instance initializer block executed, s = " + s);
    }

    /**
     * コンストラクタ
     * 
     * @param s インスタンスフィールドsの初期値
     */
    public InitializerBlock(String s) {
        this.s = s;
        System.out.println("Constructor executed with s = " + s);
    }

    /**
     * オブジェクトの文字列表現を返す。
     * 
     * このメソッドは、オブジェクトの状態を文字列として返す。
     * 
     * @return オブジェクトの文字列表現
     */
    @Override
    public String toString() {
        return "InitializerBlock{i=%d, s=%s}".formatted(i, s);
    }

    /**
     * mainメソッド。
     * 
     * このメソッドは、初期化ブロックの挙動を確認するためのサンプルコードを実行する。
     * 
     * @param args コマンドライン引数
     */
    public static void main(String... args) {
        // インスタンスを生成する
        InitializerBlock block = new InitializerBlock("Custom String");
        System.out.println("InitializerBlock instance created: " + block);
    }
}