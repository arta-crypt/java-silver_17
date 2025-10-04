package com.example.javasilver17.purple.exam.no02;

/**
 * <p>
 * 【模擬試験2 問13】<br>
 * javaコマンドでソースファイル（.java）を直接指定して実行した場合、どのクラスのmainメソッドがエントリーポイントとして選ばれるかを検証するサンプルです。
 * </p>
 * javaコマンドの挙動はバージョンによって異なります。
 * <ul>
 * <li>Java17では最初のトップレベルクラスを実行対象とする</li>
 * <li>Java22では最初のトップレベルクラスにmainがなければ、ファイル名一致クラスを実行対象とする</li>
 * </ul>
 */
class Test {
    // 引数なしmainメソッド。エントリーポイントにはならない
    public static void main() {
        System.out.println("1 ");
        Q13.main("2 ");
    }
}

public class Q13 {
    // 正しいmainメソッド（可変長引数）。javaコマンドでq13.javaを直接実行するとこちらが呼ばれる
    public static void main(String... args) {
        System.out.println("3 ");
    }
}
