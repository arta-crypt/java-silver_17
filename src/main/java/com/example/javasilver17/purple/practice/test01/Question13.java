package com.example.javasilver17.purple.practice.test01;

/**
 * レコードクラスの宣言方法と制約について確認するための練習問題クラスです。
 * <p>
 * レコードの命名規則、継承不可、可変長引数の利用例などを含みます。
 */
public class Question13 {

    /**
     * フィールドなしのレコードクラスの例です。
     */
    public record Record() {
    }

    // 「Record」というクラス名は使用可能だが、予約語「record」はクラス名として使えない。
    // レコードの宣言は「record クラス名(...) { ... }」の形式で行う。
    // Record record(String name) {}

    /**
     * Object型フィールドを持つレコードクラスの例です。
     */
    public record RecordC(Object record) {
    }

    /**
     * double型フィールドを持つレコードクラスの例です。
     */
    record ProductD(double price) {
    }

    // レコードは他のレコードやクラスを継承できない（extendsは不可）。
    // record ProductE(double price) extends Record{} // コンパイルエラー: レコードは継承不可

    /**
     * 可変長引数を持つfinalレコードクラスの例です。
     */
    final record ProductF(int... x) {
    }

    /**
     * レコードクラスのインスタンス生成と出力例を示すメインメソッドです。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        Record recordA = new Record();
        System.out.println(recordA);

        RecordC recordC = new RecordC("Hello");
        System.out.println(recordC);

        ProductD productD = new ProductD(100.0);
        System.out.println(productD);

        ProductF productF = new ProductF(1, 2, 3);
        System.out.println(productF);
    }
}
