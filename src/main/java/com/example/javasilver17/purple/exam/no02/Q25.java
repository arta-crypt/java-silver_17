package com.example.javasilver17.purple.exam.no02;

/**
 * finalメソッドのオーバーライドに関するコンパイルエラーを問う問題。
 * <p>
 * スーパークラス {@code Super} で {@code getName()} メソッドが {@code final} として宣言されています。
 * {@code final} が付与されたメソッドは、サブクラスでオーバーライド（再定義）することができません。
 * <p>
 * しかし、サブクラスである {@code Sub} は、自身の {@code getName()} メソッドを定義しようとしています。
 * これは final メソッドのオーバーライドにあたるため、コンパイルエラーが発生します。
 * <p>
 * したがって、このコードは実行できず、「finalメソッドはオーバーライドできない」というルールが問われています。
 * </p>
 */
public class Q25 {
    public static void main(String[] args) {
        // 以下のコードはSubクラスのコンパイルエラーにより実行されません。
        Super s = new Sub();
        System.out.println(s);
        ((Sub) s).reset();
        System.out.println(s.getName());
    }
}

/**
 * Subクラスへの継承のみを許可するsealedクラス。
 * getName()メソッドはfinalであり、サブクラスによるオーバーライドはできません。
 */
sealed class Super permits Sub {
    private String name = "SUPER ";

    final String getName() {
        return name;
    }

    private void reset() {
        this.name = "";
    }

    public String toString() {
        return "Super " + name;
    }
}

/**
 * Superクラスを継承するnon-sealedクラス。
 * <p>
 * スーパークラスの final メソッドである {@code getName()} をオーバーライドしようとしているため、
 * 「finalメソッドはオーバーライドできない」というルールに違反し、コンパイルエラーを引き起こします。
 * </p>
 */
on-sealed class Sub extends Super {
    private String name = "SUB ";

    // コンパイルエラー: Super.getName() は final のためオーバーライドできません
    public String getName() {
        return name;
    }

    public void reset() {
        this.name = "";
    }

    public String toString() {
        reset();
        return "Sub " + name;
    }
}