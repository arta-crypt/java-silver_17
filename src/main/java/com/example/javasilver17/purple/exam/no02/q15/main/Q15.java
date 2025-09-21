package com.example.javasilver17.purple.exam.no02.q15.main;

import com.example.javasilver17.purple.exam.no02.q15.app.sub.Sub;

/**
 * <p>
 * 【模擬試験2 問15】<br>
 * サブクラスのインスタンス生成と、継承したメソッドの呼び出しを検証するエントリーポイント。
 * </p>
 * <ul>
 * <li>Subクラスのインスタンスを生成し、print()メソッドを呼び出す。</li>
 * <li>print()はSuperクラスで定義されており、nameフィールドの内容（"Super!"）が出力される。</li>
 * <li>完全修飾名でのインスタンス化例もコメントで記載。</li>
 * </ul>
 */
public class Q15 {
    public static void main(String[] args) {
        // 下記のように完全修飾名でインスタンス化してもOK
        // その場合は右辺も左辺も両方とも完全修飾名を使用すること
        // com.example.javasilver17.knowledge.accessspecifiers.sub.Sub sub = new
        // com.example.javasilver17.knowledge.accessspecifiers.sub.Sub();

        Sub sub = new Sub();
        sub.print();
    }
}
