package com.example.javasilver17.purple.exam.no01;

class Top {
    int value = 10;
    String name = "top ";

    static void showInfo() {
        System.out.print("T ");
    }

    void print() {
        System.out.print(name);
    }
}

class Bottom extends Top {
    int value = 90;
    String name = "bottom ";

    static void showInfo() {
        System.out.print("B ");
    }

    void print() {
        System.out.print(name);
    }
}

/**
 * Java Silver SE 17 紫本 模擬試験1 問21 の検証用クラスです。
 * <p>
 * このクラスは、継承におけるポリモーフィズム（多態性）の挙動を学習します。
 * 特に、スーパークラス型の変数にサブクラスのインスタンスを代入した際に、
 * 以下の3つのメンバーの呼び出し結果がどのように異なるかを示します。
 * </p>
 * <ul>
 * <li><b>フィールド:</b> コンパイル時の型（スーパークラス）に依存する。</li>
 * <li><b>staticメソッド:</b> コンパイル時の型（スーパークラス）に依存する（メソッドの隠蔽）。</li>
 * <li><b>インスタンスメソッド:</b> 実行時のインスタンスの型（サブクラス）に依存する（メソッドのオーバーライド）。</li>
 * </ul>
 */
public class Q21 {
    /**
     * プログラムのエントリーポイント。
     * <p>
     * スーパークラスとサブクラスのインスタンスを格納した配列をループ処理し、
     * 各メンバー（staticメソッド、インスタンスメソッド、フィールド）にアクセスした際の
     * 挙動の違いを標準出力に表示します。
     * </p>
     * 
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        Top[] array = { new Top(), new Bottom() };
        for (Top t : array) {
            // staticメソッドはコンパイル時の型で決まる
            t.showInfo();
            // インスタンスメソッドは実行時の型で決まる
            t.print();
            // フィールドはコンパイル時の型で決まる
            System.out.print(t.value + ": ");
        }
    }
}