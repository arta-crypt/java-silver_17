package com.example.javasilver17.purple.exam.no02.q15.app;

/**
 * サブクラスで継承・利用される基底クラス。
 * <ul>
 * <li>protectedフィールドnameは初期化ブロックで"Super!"に設定される。</li>
 * <li>protectedメソッドprint()はnameフィールドの内容を標準出力に表示する。</li>
 * <li>サブクラスからnameやprint()にアクセス可能。</li>
 * </ul>
 */
public class Super {
    protected String name;
    {
        this.name = "Super!";
    }

    protected void print() {
        System.out.print(name);
    }
}
