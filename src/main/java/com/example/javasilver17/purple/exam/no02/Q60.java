
/**
 * <p>
 * 【Java SE 17 Silver 模擬試験2 問60】<br>
 * Javaの例外処理（独自例外クラス、switch式での例外スロー、例外のラップとgetCause()の挙動）を検証するサンプルクラスです。
 * </p>
 * <ul>
 *   <li>独自例外（UserException, CustomException）の定義とスロー方法を示します。</li>
 *   <li>switch式で例外をスローし、catch節で新たなExceptionにラップして再スローする構造を確認できます。</li>
 *   <li>mainメソッドではgetCause()を使い、ラップされた元の例外オブジェクトを取得・出力します。</li>
 *   <li>Javaの例外連鎖や例外情報の伝播の仕組みを理解するための模擬試験用サンプルです。</li>
 * </ul>
 */
package com.example.javasilver17.purple.exam.no02;

/**
 * ユーザー定義の例外クラス。
 * <p>
 * "User Ex!" などのメッセージを保持できます。
 * </p>
 */
class UserException extends Exception {
    /**
     * 指定したメッセージでUserExceptionを生成します。
     * 
     * @param message 例外メッセージ
     */
    UserException(String message) {
        super(message);
    }
}

/**
 * カスタム例外クラス。
 * <p>
 * "Custom Ex!" などのメッセージを保持できます。
 * </p>
 */
class CustomException extends Exception {
    /**
     * 指定したメッセージでCustomExceptionを生成します。
     * 
     * @param message 例外メッセージ
     */
    CustomException(String message) {
        super(message);
    }
}

/**
 * 例外処理の動作を検証するメインクラス。
 */
public class Q60 {
    /**
     * プログラムのエントリーポイント。
     * <p>
     * evaluateメソッドを呼び出し、発生した例外の原因（getCause）を出力します。
     * </p>
     * 
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        try {
            evaluate(1);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

    /**
     * 指定された値に応じて例外をスローし、catch節で新たなExceptionにラップして再スローします。
     * 
     * @param value 判定値（1:UserException, 2:CustomException）
     * @throws Exception ラップされた例外
     */
    public static void evaluate(int value) throws Exception {
        try {
            switch (value) {
                case 1 -> throw new UserException("User Ex!");
                case 2 -> throw new CustomException("Custom Ex!");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage(), e);
        }
    }
}
