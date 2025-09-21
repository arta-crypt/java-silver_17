package com.example.javasilver17.black.exam.no02;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * <p>
 * メソッドのオーバーライド、オーバーロード、ジェネリクスの型消去に関する挙動を検証するためのクラス。
 * </p>
 * <ul>
 * <li>親クラスAのメソッドを様々なパターンでオーバーライド／オーバーロードしようとした場合の可否をコメントで整理。</li>
 * <li>型消去によるシグネチャ競合や、戻り値型の共変性、戻り値型のみ異なる場合のエラーなど、Javaの仕様を確認できる。</li>
 * </ul>
 */
class A {
    /**
     * サンプルメソッド。子クラスでのオーバーライド／オーバーロードの挙動を検証するための基準となる。
     * 
     * @param s CharSequence型の要素を持つSet
     * @return Number型の要素を持つList
     */
    public List<Number> test(Set<CharSequence> s) {
        return null;
    }
}

/**
 * <p>
 * クラスAを継承し、testメソッドの様々な定義パターンについて
 * Javaのコンパイル可否や仕様をコメントで整理した検証用クラス。
 * </p>
 */
public class Q51 extends A {
    // 選択肢A
    // -> 型消去でシグネチャ競合でオーバーロード不可
    // -> 型パラメータ違いなのでオーバーライドも不可
    // public ArrayList<Number> test(Set<String> s) {
    // return null;
    // }

    // 選択肢B -> 引数型が異なりオーバーロード成立
    /**
     * TreeSet<String>型を引数に取るtestメソッドの例。
     * オーバーロードとして成立する。
     * 
     * @param s String型の要素を持つTreeSet
     * @return Integer型の要素を持つList
     */
    public List<Integer> test(TreeSet<String> s) {
        return null;
    }

    // 選択肢C
    // -> 型消去でシグネチャ競合でオーバーロード不可
    // -> 型パラメータ違いなのでオーバーライドも不可
    // public List<Integer> test(Set<String> s) {
    // return null;
    // }

    // 選択肢D
    // -> 戻り値型のジェネリクスの型パラメータが異なるのでオーバーロード不可
    // -> 戻り値の型だけが異なるメソッドは、オーバーロード不可
    // public List<Object> test(Set<CharSequence> s) {
    // return null;
    // }

    // 選択肢E
    // -> 戻り値型のジェネリクスの型パラメータが異なるのでオーバーロード不可
    // -> 戻り値の型だけが異なるメソッドは、オーバーロード不可
    // public List<Integer> test(Set<CharSequence> s) {
    // return null;
    // }

    // 選択肢F
    // -> 引数型同じ・戻り値型が共変でオーバーライド成立
    /**
     * Set<CharSequence>型を引数に取り、ArrayList<Number>を返すtestメソッドの例。
     * 親クラスの戻り値型List<Number>のサブタイプであり、共変戻り値型によるオーバーライドが成立する。
     * 
     * @param s CharSequence型の要素を持つSet
     * @return Number型の要素を持つArrayList
     */
    public ArrayList<Number> test(Set<CharSequence> s) {
        return null;
    }

    /**
     * 動作確認用のmainメソッド。
     * 
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
