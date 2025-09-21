package com.example.javasilver17.knowledge.accessspecifiers.sub;

/**
 * アクセス修飾子（private, default, protected, public）による
 * フィールド・メソッドのアクセス範囲や隠蔽・オーバーライドの可否を検証する基底クラス。
 */
public class Base {
    private String privateField = "Base.privateField";
    String defaultField = "Base.defaultField";
    protected String protectedField = "Base.protectedField";
    public String publicField = "Base.publicField";

    private String privateHidingTestField = "Base.privateHidingTestField";
    String defaultHidingTestField = "Base.defaultHidingTestField";
    protected String protectedHidingTestField = "Base.protectedHidingTestField";
    public String publicHidingTestField = "Base.publicHidingTestField";

    // スコープを狭める隠蔽テスト用
    String defaultHidingToNarrowScopeTestField = "Base.defaultHidingToNarrowScopeTestField";
    protected String protectedToNarrowScopeHidingTestField = "Base.protectedToNarrowScopeHidingTestField";

    /**
     * 各フィールドのアクセス可否を確認するメソッド。
     */
    public void printFields() {
        System.out.println(this.getClass().getSimpleName() + "." + privateField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + protectedField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + defaultField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + publicField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + privateHidingTestField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + protectedHidingTestField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + defaultHidingTestField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + publicHidingTestField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + defaultHidingToNarrowScopeTestField); // OK
        System.out.println(this.getClass().getSimpleName() + "." + protectedToNarrowScopeHidingTestField); // OK
    }

    private void privateMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.privateMethod()");
    }

    protected void protectedMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.protectedMethod()");
    }

    void defaultMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.defaultMethod()");
    }

    public void publicMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.publicMethod()");
    }

    /**
     * 各メソッドのアクセス可否を確認するメソッド。
     */
    public void callMethods() {
        privateMethod(); // OK
        protectedMethod(); // OK
        defaultMethod(); // OK
        publicMethod(); // OK
    }

    private void privateOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.privateOverrideTestMethod()");
    }

    protected void protectedOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.protectedOverrideTestMethod()");
    }

    void defaultOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.defaultOverrideTestMethod()");
    }

    public void publicOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.publicOverrideTestMethod()");
    }

    protected void protectedToMoreWideScopeOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.protectedToMoreWideScopeOverrideTestMethod()");
    }

    void defaultToMoreWideScopeOverrideTestMethod() {
        System.out.println(this.getClass().getSimpleName() + "." + "Base.defaultToMoreWideScopeOverrideTestMethod()");
    }

    /**
     * オーバーライド可否を確認するメソッド。
     */
    public void callOverrideTestMethods() {
        privateOverrideTestMethod(); // OK
        protectedOverrideTestMethod(); // OK
        defaultOverrideTestMethod(); // OK
        publicOverrideTestMethod(); // OK
        protectedToMoreWideScopeOverrideTestMethod(); // OK
        defaultToMoreWideScopeOverrideTestMethod(); // OK
    }
}
