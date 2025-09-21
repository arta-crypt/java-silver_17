package com.example.javasilver17.knowledge.accessspecifiers;

import com.example.javasilver17.knowledge.accessspecifiers.sub.*;

/**
 * Baseクラスを継承し、異なるパッケージからアクセス修飾子の挙動や
 * 隠蔽・オーバーライドの可否を検証するサブクラス（別パッケージ）。
 */
class Sub2 extends Base {

    protected String protectedHidingTestField = "Sub2.protectedHidingTestField";
    // コンパイルエラーは発生しないが、defaultは同一パッケージ内でのみアクセス可能なため、隠蔽とはならない。
    // String defaultHidingTestField = "Sub2.defaultHidingTestField";
    public String publicHidingTestField = "Sub2.publicHidingTestField";

    // コンパイルエラーは発生しないが、defaultは同一パッケージ内でのみアクセス可能なため、隠蔽とはならない。
    // private String defaultHidingToNarrowScopeTestField =
    // "Sub2.defaultToMoreWideScopeHidingTestField";
    private String protectedToNarrowScopeHidingTestField = "Sub2.protectedToMoreWideScopeHidingTestField";

    /**
     * 各フィールドのアクセス可否を確認するメソッド。
     */
    public void printFields() {
        /*
         * フィールドの隠蔽（同名で再定義）
         */

        // コンパイルエラー。理由：privateは同一クラス内でのみアクセス可能
        // System.out.println(this.getClass().getSimpleName() + "." + privateField);

        System.out.println(this.getClass().getSimpleName() + "." + protectedField); // OK

        // コンパイルエラー。理由：defaultは同一パッケージ内でのみアクセス可能
        // System.out.println(this.getClass().getSimpleName() + "." + defaultField);

        System.out.println(this.getClass().getSimpleName() + "." + publicField); // OK

        System.out.println(this.getClass().getSimpleName() + "." + protectedHidingTestField); // OK

        // コンパイルエラーは発生しないが、defaultは同一パッケージ内でのみアクセス可能なため、隠蔽とはならない。
        // System.out.println(this.getClass().getSimpleName() + "." +
        // defaultHidingTestField);

        System.out.println(this.getClass().getSimpleName() + "." + publicHidingTestField); // OK

        /*
         * スコープを狭める隠蔽テスト用
         */

        // コンパイルエラーは発生しないが、defaultは同一パッケージ内でのみアクセス可能なため、隠蔽とはならない。
        // System.out.println(this.getClass().getSimpleName() + "." +
        // defaultToMoreWideScopeHidingTestField); // OK

        System.out.println(this.getClass().getSimpleName() + "." + protectedToNarrowScopeHidingTestField); // OK
    }

    /**
     * 各メソッドのアクセス可否を確認するメソッド。
     */
    public void callMethods() {
        // コンパイルエラー。理由：privateは同一クラス内でのみアクセス可能
        // privateMethod();

        protectedMethod(); // OK

        // コンパイルエラー。理由：defaultは同一パッケージ内でのみアクセス可能
        // defaultMethod();

        publicMethod(); // OK
    }

    // privateにするとコンパイルエラーになる。 理由：privateメソッドはオーバーライドできない
    // アクセス修飾子の範囲を狭くすることはできない
    // @Override
    // private void privateOverrideTestMethod() {
    // System.out.println(this.getClass().getSimpleName() + "." +
    // "Base.privateOverrideTestMethod()");
    // }

    @Override
    protected void protectedOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.protectedOverrideTestMethod()");
    }

    // コンパイルエラー。理由：defaultは同一パッケージ内でのみアクセス可能
    // @Override
    // void defaultOverrideTestMethod() {
    // System.out.println(this.getClass().getSimpleName() + "." +
    // "Base.defaultOverrideTestMethod()");
    // }

    @Override
    public void publicOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.publicOverrideTestMethod()");
    }

    @Override
    public void protectedToMoreWideScopeOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.protectedToMoreWideScopeOverrideTestMethod()");
    }

    // コンパイルエラー。理由：defaultは同一パッケージ内でのみアクセス可能
    // @Override
    // protected void defaultToMoreWideScopeOverrideTestMethod() {
    // System.out.println(this.getClass().getSimpleName() + "." +
    // "Base.defaultToMoreWideScopeOverrideTestMethod()");
    // }

    /**
     * オーバーライド可否を確認するメソッド。
     */
    @Override
    public void callOverrideTestMethods() {
        // コンパイルエラー。理由：privateメソッドはオーバーライドできない
        // privateOverrideTestMethod();

        protectedOverrideTestMethod(); // OK

        // コンパイルエラー。理由：defaultは同一パッケージ内でのみアクセス可能
        // defaultOverrideTestMethod();

        publicOverrideTestMethod(); // OK

        protectedToMoreWideScopeOverrideTestMethod(); // OK

        // コンパイルエラー。理由：defaultは同一パッケージ内でのみアクセス可能
        // defaultToMoreWideScopeOverrideTestMethod();
    }
}

/**
 * アクセス修飾子の挙動や、フィールド・メソッドの隠蔽・オーバーライドの可否を
 * Base, Sub, Sub2クラスで検証するためのエントリーポイント。
 */
public class AccessSpecifiers {
    public static void main(String[] args) {
        Base base = new Base();
        base.printFields();
        base.callMethods();
        base.callOverrideTestMethods();

        System.out.println("--------------------");

        Sub sub = new Sub();
        sub.printFields();
        sub.callMethods();
        sub.callOverrideTestMethods();

        System.out.println("--------------------");

        Sub2 sub2 = new Sub2();
        sub2.printFields();
        sub2.callMethods();
        sub2.callOverrideTestMethods();
    }
}
