package com.example.javasilver17.purple.exam.no02.q15.app.sub;

import com.example.javasilver17.purple.exam.no02.q15.app.Super;

/**
 * <p>
 * Superクラスを継承したサブクラス。
 * </p>
 * <ul>
 * <li>Superクラスのprotectedフィールドnameやprotectedメソッドprint()にアクセス可能。</li>
 * <li>Q15クラスからインスタンス化され、print()メソッドを呼び出される。</li>
 * </ul>
 */
public class Sub extends Super {
    public void print() {
        System.out.print(name);
        System.out.println("Sub#print()");
    }
}
