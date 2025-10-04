package com.example.javasilver17.purple.exam.no02;

/**
 * Javaのテキストブロックにおけるエスケープシーケンスに関する問題。
 * <p>
 * テキストブロック内では、ほとんどの文字をエスケープせずに記述できますが、
 * 終了を示す3つのダブルクォート（"""）の直前にダブルクォート（"）を置く場合は、
 * バックスラッシュ（\）でエスケープする必要があります。
 * このコードでは {@code Java "17"} という文字列の末尾に {@code "} を追加しようとしており、
 * {@code \"} とエスケープしているため、正しくコンパイル・実行されます。
 * もしエスケープしない場合、コンパイルエラーとなります。
 * </p>
 */
public class Q38 {
    public static void main(String[] args) {
        String test = """
                Java "17\"""";
        System.out.println(test);
    }
}
