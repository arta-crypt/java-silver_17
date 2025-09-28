package q04.x;

import q04.y.Test;

/**
 * Java Silver SE 17 紫本 模擬試験1 問4 の検証用クラスです。
 * <p>
 * このクラスは、異なるパッケージに属するクラス (`q04.y.Test`) を利用します。
 * 主な目的は、このようなパッケージ構造を持つJavaファイルを
 * どのようにコンパイル ({@code javac}) し、実行 ({@code java}) するか、
 * 特に {@code -d} オプションや {@code -classpath} オプションの正しい使い方を
 * 確認することです。
 * </p>
 * <p>
 * コード自体は、{@code q04.y.Test} クラスの static メソッドを呼び出すだけの単純なものです。
 * </p>
 * 
 * <h3>関連するコマンド例（設問より）</h3>
 * 
 * <pre>
 * // 選択肢A
 * javac -d . Main.java Test.java
 * java -classpath . q04.x.Main
 * 
 * // 選択肢C
 * // カレントディレクトリにパッケージ構造を作成しないため、実行時にクラスが見つからずエラーになる
 * javac *.java
 * java q04.x.Main
 * 
 * // 選択肢D
 * javac -d classes *.java
 * java -classpath classes q04.x.Main
 * </pre>
 */
public class Main {
    /**
     * プログラムのエントリーポイント。
     * <p>
     * 別のパッケージにある {@code Test.print()} メソッドを呼び出します。
     * </p>
     * 
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        Test.print();
    }
}
