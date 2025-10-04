package com.example.javasilver17.purple.exam.no02.q23;

/**
 * {@code Item.java}で定義された型階層の有効性を検証する実行クラス。
 * <p>
 * このクラスがコンパイル可能であるためには、{@link Drink}クラスが
 * 可視であり、かつインスタンス化可能である必要があります。
 * </p>
 */
public class Q23 {
    /**
     * プログラムのエントリーポイント。
     * <p>
     * {@link Drink}のインスタンスを生成し、そのクラスの完全修飾名を出力します。
     * これにより、JVMがクラスを正しくロードできることを示します。
     * </p>
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        Drink drink = new Drink();
        System.out.println(drink.getClass().getCanonicalName());
    }
}