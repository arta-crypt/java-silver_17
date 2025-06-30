package com.example.javasilver17.knowledge.interfacesample;

/**
 * JavaSilver17の学習用具象クラス。
 * <p>
 * Child1インターフェースを実装し、定数とデフォルトメソッドの利用例を示します。
 * </p>
 */
public class Concrete2 implements Child1 {
    /**
     * サンプル定数（値: 112）
     */
    int CONSTANT = 112;

    /**
     * 動作確認用mainメソッド。
     */
    public static void main(String[] args) {
        Concrete2 concrete = new Concrete2();
        concrete.method(); // This will call the method in Child interface
    }
}
