package com.example.javasilver17.purple.exam.no02;

/**
 * <p>
 * 【模擬試験2 問1】<br>
 * インターフェース内のフィールド宣言に関するJavaの仕様を検証するためのサンプルコードです。
 * </p>
 * <ul>
 *   <li>インターフェースのフィールドは、明示しなくても自動的に <b>public static final</b> となることを確認できます。</li>
 *   <li>不正な修飾子（protected, private, abstract）や初期化なしのフィールド宣言がコンパイルエラーとなることをコメントで示しています。</li>
 *   <li>唯一正しく利用できるフィールド宣言がどれか、実装クラスとmainメソッドで動作確認できます。</li>
 * </ul>
 */

/**
 * <p>
 * 【模擬試験2 問1】インターフェース内のフィールド宣言の仕様を検証するためのインターフェースです。
 * </p>
 * <ul>
 * <li>インターフェースのフィールドは自動的に <b>public static final</b> となることを示します。</li>
 * <li>不正な修飾子や初期化なしのフィールド宣言がコンパイルエラーとなることをコメントで説明しています。</li>
 * <li>唯一正しいフィールド宣言（C_SPEED）のみが利用可能です。</li>
 * </ul>
 */
interface Playable {
    // インターフェースのフィールドにprotectedは使えません（コンパイルエラー）
    // protected double A_SPEED = 1.25;

    // インターフェースのフィールドにprivateは使えません（コンパイルエラー）
    // private double B_SPEED = 1.25;

    // finalのみでも、インターフェースのフィールドは自動的にpublic static finalとなるため、唯一正しい宣言
    final double C_SPEED = 1.25;

    // フィールドにabstractは使えません。また、初期化も必須です（コンパイルエラー）
    // public abstract double D_SPEED;

    // インターフェースのフィールドは初期化が必須です（値が必要、コンパイルエラー）
    // public double E_SPEED;

    // 宣言自体はコンパイル成功します。Javaの仕様上、インターフェースのフィールドは常に public static final です（明示しなくてもOK）
    // ただし、使用側が大文字のF_SPEEDなのでコンパイルエラー
    // static double F_speed = 1.25;

    void play();
}

/**
 * <p>
 * Playableインターフェースを実装し、正しいフィールドのみを利用して動作確認を行うクラス。
 * </p>
 */
class MusicPlayer implements Playable {
    public void play() {
        // System.out.println("Playing..." + A_SPEED + "x");
        // System.out.println("Playing..." + B_SPEED + "x");
        System.out.println("Playing..." + C_SPEED + "x");
        // System.out.println("Playing..." + D_SPEED + "x");
        // System.out.println("Playing..." + E_SPEED + "x");
        // System.out.println("Playing..." + F_SPEED + "x");
    }
}

/**
 * <p>
 * 動作確認用のエントリーポイントクラス。
 * </p>
 */
public class q01 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play();
    }
}
