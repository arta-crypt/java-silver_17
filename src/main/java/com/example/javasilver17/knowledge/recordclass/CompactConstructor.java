package com.example.javasilver17.knowledge.recordclass;

/**
 * JavaSilver17の学習用サンプルクラスです。
 * <p>
 * レコード型のコンパクトコンストラクタの使い方と、
 * バリデーション処理の実装例を示します。
 * </p>
 * <ul>
 * <li>testRecordレコードは、整数iが奇数、文字列sがnullや空でないことを保証します。</li>
 * <li>mainメソッドで正常・異常なインスタンス生成例を確認できます。</li>
 * </ul>
 */
public class CompactConstructor {
    /**
     * レコード型testRecordのサンプル。
     * <p>
     * iが偶数の場合、またはsがnull/空文字列の場合はIllegalArgumentExceptionをスローします。
     * </p>
     * 
     * @param i 整数（奇数のみ許容）
     * @param s 文字列（null・空文字列不可）
     */
    record testRecord(int i, String s) {
        // コンパクトコンストラクタ
        testRecord {
            if (i % 2 == 0) {
                throw new IllegalArgumentException("i must be odd");
            }
            if (s == null || s.isEmpty()) {
                throw new IllegalArgumentException("s must not be null or empty");
            }
        }
    }

    /**
     * エントリポイント。
     * <p>
     * testRecordのインスタンス生成例と、バリデーションによる例外発生例を出力します。
     * </p>
     * 
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        // 正常なインスタンスの生成
        testRecord tr1 = new testRecord(3, "Hello");
        System.out.println("tr1: " + tr1);

        // 異常なインスタンスの生成
        try {
            testRecord tr2 = new testRecord(4, "World"); // 例外が発生する
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            testRecord tr3 = new testRecord(5, ""); // 例外が発生する
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
