package com.example.javasilver17.knowledge.modifiers;

/**
 * JavaSilver17の学習用sealedインターフェース。
 * <p>
 * ParentInterfaceを継承し、sealedインターフェースの使い方とデフォルトメソッド例を示します。
 * Concrete1, Concrete2, Concrete3のみ実装を許可します。
 * </p>
 */
public sealed interface ChildInterface2 extends ParentInterface permits Concrete1, Concrete2, Concrete3 {
    /**
     * ParentInterfaceのデフォルトメソッドを呼び出し、追加の出力を行うサンプル。
     */
    default void method() {
        ParentInterface.super.method(); // ParentInterfaceのデフォルトメソッドを呼び出す
        System.out.println("ChildInterface2 method");
    }
}
