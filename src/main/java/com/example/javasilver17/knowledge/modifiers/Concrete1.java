package com.example.javasilver17.knowledge.modifiers;

/**
 * JavaSilver17の学習用finalクラス。
 * <p>
 * ChildInterface2を実装し、finalクラスの使い方とメソッドオーバーライド例を示します。
 * </p>
 */
public final class Concrete1 implements ChildInterface2 {
    /**
     * ChildInterface2のデフォルトメソッドをオーバーライド。
     */
    @Override
    public void method() {
        ChildInterface2.super.method(); // ChildInterface2のデフォルトメソッドを呼び出す
        System.out.println("Concrete1 method");
    }

    /**
     * 動作確認用mainメソッド。
     */
    public static void main(String[] args) {
        Concrete1 concrete1 = new Concrete1();
        concrete1.method();
    }
}
