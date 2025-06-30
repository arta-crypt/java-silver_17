package com.example.javasilver17.knowledge.interfacesample;

/**
 * JavaSilver17の学習用インターフェース。
 * <p>
 * サンプル定数とデフォルトメソッドを持つインターフェースです。
 * </p>
 */
public interface Parent {
    /**
     * サンプル定数（値: 10）
     */
    int CONSTANT = 10;

    /**
     * デフォルトメソッドのサンプル。
     * <p>
     * 定数CONSTANTの値を出力します。
     * </p>
     */
    default void method() {
        System.out.println("Parent method: " + CONSTANT);
    }
}
