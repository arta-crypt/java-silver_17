package com.example.javasilver17.knowledge.modifiers;

/**
 * JavaSilver17の学習用finalクラス。
 * <p>
 * ChildInterface1を実装し、finalクラスの使い方とメソッドオーバーライド例を示します。
 * </p>
 */
public final class Concrete5 implements ChildInterface1 {
    /**
     * ChildInterface1のデフォルトメソッドをオーバーライド。
     */
    @Override
    public void method() {
        ChildInterface1.super.method(); // ChildInterface1のデフォルトメソッドを呼び出す
        System.out.println("Concrete5 method");
    }

    /**
     * 動作確認用mainメソッド。
     */
    public static void main(String[] args) {
        Concrete5 concrete5 = new Concrete5();
        concrete5.method(); // "Concrete5 method"と出力される
    }

}
