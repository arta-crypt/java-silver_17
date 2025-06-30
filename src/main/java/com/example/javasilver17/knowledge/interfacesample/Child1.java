package com.example.javasilver17.knowledge.interfacesample;

/**
 * JavaSilver17の学習用インターフェース。
 * <p>
 * Parentインターフェースを継承し、定数とデフォルトメソッドを持つサンプルです。
 * </p>
 */
public interface Child1 extends Parent {
    /**
     * サンプル定数（値: 11）
     */
    int CONSTANT = 11;

    /**
     * デフォルトメソッドのサンプル。
     * <p>
     * 定数CONSTANTの値を出力します。
     * </p>
     */
    default void method() {
        System.out.println("Child1 method: " + CONSTANT);
    }
}
