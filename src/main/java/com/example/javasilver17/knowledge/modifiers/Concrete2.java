package com.example.javasilver17.knowledge.modifiers;

/**
 * JavaSilver17の学習用non-sealedクラス。
 * <p>
 * ChildInterface2を実装し、non-sealedクラスの使い方とメソッドオーバーライド例を示します。
 * </p>
 */
public non-sealed class Concrete2 implements ChildInterface2 {
    /**
     * ChildInterface2のデフォルトメソッドをオーバーライド。
     */
    @Override
    public void method() {
        ChildInterface2.super.method(); // ChildInterface2のデフォルトメソッドを呼び出す
        System.out.println("Concrete2 method");
    }

    /**
     * 動作確認用mainメソッド。
     */
    public static void main(String[] args) {
        Concrete2 concrete2 = new Concrete2() {
        };
        concrete2.method(); // "Concrete2 method"と出力される
    }
}
