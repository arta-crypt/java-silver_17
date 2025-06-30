package com.example.javasilver17.knowledge.modifiers;

/**
 * JavaSilver17の学習用non-sealedインターフェース。
 * <p>
 * ParentInterfaceを継承し、non-sealedインターフェースの使い方とデフォルトメソッド例を示します。
 * </p>
 */
public non-sealed interface ChildInterface1 extends ParentInterface {
    /**
     * ParentInterfaceのデフォルトメソッドを呼び出し、追加の出力を行うサンプル。
     */
    default void method() {
        ParentInterface.super.method(); // ParentInterfaceのデフォルトメソッドを呼び出す
        System.out.println("ChildInterface1 method");
    }
}
