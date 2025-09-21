package com.example.javasilver17.black.exam.no02;

/**
 * <p>
 * 問22: while文とswitch文を組み合わせた制御フローの動作確認用クラス。
 * </p>
 * <p>
 * int型変数numを2から始め、numが5未満の間、numの偶奇によってswitch文でインクリメント処理を行う。
 * 最終的なnumの値を標準出力に表示する。
 * </p>
 */
public class q22 {
    /**
     * プログラムのエントリーポイント。
     * 
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        int num = 2;
        while (num < 5) {
            switch (num % 2) {
                case 0:
                    ++num;
                    break;
                case 1:
                    num++;
            }
        }
        System.out.println(num);
    }
}
