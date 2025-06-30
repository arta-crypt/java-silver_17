package com.example.javasilver17.knowledge.interfacesample;

/**
 * JavaSilver17の学習用インターフェース。
 * <p>
 * Parentインターフェースを継承し、定数とデフォルトメソッドを持つサンプルです。
 * </p>
 */
public interface Child2 extends Parent {
    /**
     * サンプル定数（値: 12）
     */
    int CONSTANT = 12;

    /**
     * デフォルトメソッドのサンプル。
     * <p>
     * 定数CONSTANTの値を出力します。
     * </p>
     */
    default void method() {
        System.out.println("Child2 method: " + CONSTANT);
    }

    /**
     * Parentインターフェースのデフォルトメソッドを呼び出すサンプル。
     */
    default void parentMethod() {
        Parent.super.method();
    }
}
