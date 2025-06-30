package com.example.javasilver17.knowledge.modifiers;

/**
 * JavaSilver17の学習用sealedインターフェース。
 * <p>
 * ChildInterface1, ChildInterface2のみ継承を許可します。
 * デフォルトメソッドのサンプルも含みます。
 * </p>
 */
sealed interface ParentInterface permits ChildInterface1, ChildInterface2 {
    /**
     * デフォルトメソッドのサンプル。
     */
    default void method() {
        System.out.println("ParentInterface method");
    }
}
