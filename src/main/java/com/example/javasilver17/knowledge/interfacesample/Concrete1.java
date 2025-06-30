package com.example.javasilver17.knowledge.interfacesample;

/**
 * JavaSilver17の学習用具象クラス。
 * <p>
 * Child1インターフェースを実装し、定数とメソッドのオーバーライド例を示します。
 * </p>
 */
public class Concrete1 implements Child1 {
    /**
     * サンプル定数（値: 111）
     */
    int CONSTANT = 111;

    /**
     * Child1のデフォルトメソッドをオーバーライド。
     * <p>
     * 独自のCONSTANT値を出力します。
     * </p>
     */
    @Override
    public void method() {
        System.out.println("Concrete method: " + CONSTANT);
    }

    /**
     * 動作確認用mainメソッド。
     */
    public static void main(String[] args) {
        Concrete1 concrete = new Concrete1();
        concrete.method(); // This will call the method in Concrete class
    }

}
