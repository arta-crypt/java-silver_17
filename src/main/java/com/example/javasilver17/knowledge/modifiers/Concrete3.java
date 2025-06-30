package com.example.javasilver17.knowledge.modifiers;

/**
 * JavaSilver17の学習用sealedクラス。
 * <p>
 * ChildInterface2を実装し、sealedクラスの使い方とメソッドオーバーライド例を示します。
 * </p>
 * Concrete4のみ継承を許可します。
 */
public sealed class Concrete3 implements ChildInterface2 permits Concrete4 {
    /**
     * ChildInterface2のデフォルトメソッドをオーバーライド。
     */
    @Override
    public void method() {
        ChildInterface2.super.method(); // ChildInterface2のデフォルトメソッドを呼び出す
        System.out.println("Concrete3 method");
    }

    /**
     * 動作確認用mainメソッド。
     */
    public static void main(String[] args) {
        Concrete3 concrete3 = new Concrete3();
        concrete3.method(); // "Concrete3 method"と出力される
    }
}
