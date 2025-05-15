
package com.example.javasilver17.knowledge.type;

/**
 * バイト型（byte）の動作を示すサンプルクラス。
 * 
 * このクラスは、Javaのバイト型の特性と、バイナリリテラルを使用した初期化方法を説明します。
 * バイト型は8ビットの符号付き整数型で、-128から127までの値を保持できます。
 * 
 * <p>主な特徴:
 * <ul>
 *   <li>バイナリリテラル（0b）を使用した初期化</li>
 *   <li>2の補数表現での負の数の扱い</li>
 *   <li>バイト型の最小値と最大値の確認</li>
 * </ul>
 * 
 * <p>出力される値は以下の通りです:
 * <ul>
 *   <li>0: 最小のバイナリ表現</li>
 *   <li>1: 最小の正の数</li>
 *   <li>127: 最大の正の数</li>
 *   <li>-128: 最小の負の数</li>
 * </ul>
 * 
 * @author ユーザー
 * @version 1.0
 * @see java.lang.Byte
 */
public class ByteSample {
    public static void main(String[] args) {
        // バイナリリテラルを使用したバイト型変数の初期化
        byte b1 = 0b0000_0000;  // 0
        byte b2 = 0b0000_0001;  // 1
        byte b3 = 0b0111_1111;  // 127 (最大の正の数)
        byte b4 = (byte)0b1111_1111;  // -1
        byte b5 = (byte)0b1111_1110;  // -2
        byte b6 = (byte)0b1111_1101;  // -3
        byte b7 = (byte)0b1000_0000;  // -128 (最小の負の数)

        // 各バイト型変数の値を出力
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
    }
}