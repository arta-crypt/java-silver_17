package com.example.javasilver17.purple.exam.no02;

/**
 * <p>
 * 【模擬試験2 問13】<br>
 * javaコマンドでソースファイル（.java）を直接指定して実行した場合、どのクラスのmainメソッドがエントリーポイントとして選ばれるかを検証するサンプルです。
 * </p>
 * <ul>
 * <li>Testクラスには main(String[] args) ではなく main()
 * しかないため、エントリーポイントとして認識されません。</li>
 * <li>q13クラスには main(String...
 * args)（可変長引数）があるため、javaコマンドでこのファイルを直接実行するとq13のmainが呼ばれます。</li>
 * <li>javaコマンドで .java
 * ファイルを直接実行した場合、ファイル名と同じpublicクラス（ここではq13）が優先され、そのmainメソッドがエントリーポイントになります。</li>
 * </ul>
 */
class Test {
    // 引数なしmainメソッド。エントリーポイントにはならない
    public static void main() {
        System.out.println("1 ");
        q13.main("2 ");
    }
}

public class q13 {
    // 正しいmainメソッド（可変長引数）。javaコマンドでq13.javaを直接実行するとこちらが呼ばれる
    public static void main(String... args) {
        System.out.println("3 ");
    }
}
