package com.example.javasilver17.purple.practice.test01;

/**
 * ローカル変数と定数(final変数)の初期化について確認するための練習問題クラスです。
 * <p>
 * final変数は必ず初期化される必要があり、条件分岐によって初期化されない可能性がある場合はコンパイルエラーとなります。
 */
public class Question14 {

    /**
     * final変数の初期化に関する動作を確認するメソッドです。
     * 条件によって初期化されない場合、コンパイルエラーとなる例を含みます。
     *
     * @param a 任意のint値
     */
    public static void main(int a) {
        final var FLAG = true;
        final int VALUE;
        if (!FLAG)
            VALUE = 100;
        // System.out.println(VALUE); // VALUEが初期化されない可能性があるため、コンパイルエラーになる
    }

    /**
     * エントリーポイントとなるmainメソッドです。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        new Question14().main(100);
    }
}
