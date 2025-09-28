package com.example.javasilver17.purple.exam.no01;

// 選択肢A
// コンパイルエラー：フィールドのないレコードは定義できない
// record Record() {}

// 選択肢B
// コンパイルエラー：recordは小文字のrで始まる
// Record record(String name){}

// 選択肢C
// コンパイル成功
record Record(Object record) {
}

// 選択肢D
// コンパイル成功
record ProductD(double price) {
}

// 選択肢E
// コンパイルエラー：java.lang.Recordクラスは特別扱いなので、ユーザーが直接継承させることはできない
// recordは暗黙的にjava.lang.Recordを継承する
// record Product(double price)extends Record {}

// 選択肢F
// コンパイル成功
final record ProductF(int... x) {
}

/**
 * Java Silver SE 17 紫本 模擬試験1 問13 の検証用クラスです。
 * <p>
 * このファイルは、Javaで導入された {@code record} の正しい定義方法について学習します。
 * ファイル内には、設問で提示された様々なパターンのレコード定義が含まれており、
 * コンパイルが成功するものと失敗するものをコメントで示しています。
 * </p>
 * <ul>
 * <li>レコードのコンポーネント（フィールド）は必須であること</li>
 * <li>{@code record} キーワードは小文字であること</li>
 * <li>レコードが暗黙的に {@code final} であること（明示的に final を付けても良い）</li>
 * <li>レコードが他のクラスを明示的に継承できないこと</li>
 * <li>可変長引数をコンポーネントとして持てること</li>
 * </ul>
 */
public class Q13 {
    /**
     * プログラムのエントリーポイント。
     * <p>
     * このクラスはレコード定義のコンパイル可否を確認することが目的のため、
     * mainメソッド自体は具体的な処理を行いません。
     * </p>
     * 
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        System.out.println("OK");
    }
}