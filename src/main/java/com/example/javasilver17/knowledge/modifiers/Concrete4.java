package com.example.javasilver17.knowledge.modifiers;

/**
 * JavaSilver17の学習用finalクラス。
 * <p>
 * Concrete3を継承し、finalクラスの使い方とメソッドオーバーライド例を示します。
 * </p>
 */
public final class Concrete4 extends Concrete3 {
    /**
     * Concrete3のメソッドをオーバーライド。
     */
    @Override
    public void method() {
        super.method(); // Concrete3のメソッドを呼び出す
        System.out.println("Concrete4 method");
    }

    /**
     * 動作確認用mainメソッド。
     */
    public static void main(String[] args) {
        Concrete4 concrete4 = new Concrete4();
        concrete4.method(); // "Concrete4 method"と出力される
    }
}
