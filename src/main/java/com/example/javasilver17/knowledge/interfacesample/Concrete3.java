package com.example.javasilver17.knowledge.interfacesample;

/**
 * JavaSilver17の学習用具象クラス。
 * <p>
 * Child1, Child2インターフェースを実装し、複数インターフェースのデフォルトメソッド呼び出し例を示します。
 * </p>
 */
public class Concrete3 implements Child1, Child2 {
    /**
     * サンプル定数（値: 133）
     */
    int CONSTANT = 133;

    /**
     * Child1, Child2のデフォルトメソッドを呼び出す例。
     */
    @Override
    public void method() {
        Child1.super.method(); // Calls the method from Child1
        Child2.super.method(); // Calls the method from Child2
        // Cannot call Parent.super.method() directly due to Java restrictions
    }

    /**
     * 動作確認用mainメソッド。
     */
    public static void main(String[] args) {
        Concrete3 concrete = new Concrete3();
        concrete.method(); // This will call the method in both Child1 and Child2
        concrete.parentMethod(); // This will call the method in Parent
    }

}
