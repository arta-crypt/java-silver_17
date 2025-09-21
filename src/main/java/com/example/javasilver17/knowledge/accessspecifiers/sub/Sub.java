package com.example.javasilver17.knowledge.accessspecifiers.sub;

/**
 * Baseクラスを継承し、アクセス修飾子ごとのフィールド・メソッドの隠蔽や
 * オーバーライドの可否を検証するサブクラス（同一パッケージ）。
 */
public class Sub extends Base {

    // フィールドの隠蔽（同名で再定義）
    protected String protectedHidingTestField = "Sub.protectedHidingTestField";
    String defaultHidingTestField = "Sub.defaultHidingTestField";
    public String publicHidingTestField = "Sub.publicHidingTestField";

    // スコープを狭める隠蔽テスト用
    private String defaultHidingToNarrowScopeTestField = "Sub.defaultToMoreWideScopeHidingTestField";
    private String protectedToNarrowScopeHidingTestField = "Sub.protectedToMoreWideScopeHidingTestField";

    /**
     * 各フィールドのアクセス可否を確認するメソッド。
     */
    public void printFields() {
        // コンパイルエラー。理由：privateは同一クラス内でのみアクセス可能
        // System.out.println(this.getClass().getSimpleName() + "." + privateField);

        System.out.println(this.getClass().getSimpleName() + "." + protectedField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + defaultField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + publicField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + protectedHidingTestField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + defaultHidingTestField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + publicHidingTestField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + defaultHidingToNarrowScopeTestField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + protectedToNarrowScopeHidingTestField); // OK
    }

    /**
     * 各メソッドのアクセス可否を確認するメソッド。
     */
    public void callMethods() {
        // コンパイルエラー。理由：privateは同一クラス内でのみアクセス可能
        // privateMethod();

        protectedMethod(); // OK
        defaultMethod(); // OK
        publicMethod(); // OK
    }

    // コンパイルエラー。理由：privateは同一クラス内でのみアクセス可能
    // @Override
    // private void privateOverrideTestMethod() {
    // System.out.println(this.getClass().getSimpleName() + "." +
    // "Base.privateOverrideTestMethod()");
    // }

    @Override
    protected void protectedOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.protectedOverrideTestMethod()");
    }

    @Override
    void defaultOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.defaultOverrideTestMethod()");
    }

    @Override
    public void publicOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.publicOverrideTestMethod()");
    }

    @Override
    public void protectedToMoreWideScopeOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.protectedToMoreWideScopeOverrideTestMethod()");
    }

    @Override
    protected void defaultToMoreWideScopeOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.defaultToMoreWideScopeOverrideTestMethod()");
    }

    /**
     * オーバーライド可否を確認するメソッド。
     */
    @Override
    public void callOverrideTestMethods() {
        // コンパイルエラー。理由：privateは同一クラス内でのみアクセス可能
        // privateOverrideTestMethod();

        protectedOverrideTestMethod(); // OK
        defaultOverrideTestMethod(); // OK
        publicOverrideTestMethod(); // OK
        protectedToMoreWideScopeOverrideTestMethod(); // OK
        defaultToMoreWideScopeOverrideTestMethod(); // OK
    }
}
