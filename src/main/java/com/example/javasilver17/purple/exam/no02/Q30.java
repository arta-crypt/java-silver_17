package com.example.javasilver17.purple.exam.no02;

/**
 * <p>
 * 【模擬試験2 問30】<br>
 * Stringのtrim(), indexOf(), contains(), ==,
 * equals()などの動作や、リテラルと生成文字列の参照比較・内容比較の違いを検証するサンプルです。
 * </p>
 * <ul>
 * <li>trim()で生成される新しいStringインスタンスとリテラルの==比較がfalseになる理由を確認できます。</li>
 * <li>indexOfの開始位置指定やcontainsの動作も合わせて検証しています。</li>
 * <li>==は参照比較、equalsは内容比較であることを理解するための例題です。</li>
 * </ul>
 */
public class Q30 {
    public static void main(String[] args) {
        String text = " Lime Lemon ";
        text = text.trim();

        // 選択肢Aは省略（簡単に間違いがわかったため）

        // text.indexOf("m", 4) は7を返すため、true
        if (text.indexOf("m", 4) == 7)
            System.out.println("B");

        // 選択肢Cは省略（簡単に間違いがわかったため）

        // text.trim() の結果は新しいインスタンスを返すため、==ではfalse
        if (text == "Lime Lemon")
            System.out.println("D");

        // text.contains("m") はtrue
        if (text.contains("m"))
            System.out.println("E");

        // 選択肢Fは省略（簡単に間違いがわかったため）
    }
}
