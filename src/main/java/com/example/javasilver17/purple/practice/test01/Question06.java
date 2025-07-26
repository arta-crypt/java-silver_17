package com.example.javasilver17.purple.practice.test01;

import javax.management.RuntimeErrorException;

/**
 * Exceptionを継承した例外です。
 */
class FirstException extends Exception {
}

/**
 * FirstExceptionを継承したサブクラスの例外です。
 */
class SubFirstException extends FirstException {
}

/**
 * 実行時例外のサンプルクラスです。
 */
class SecondException extends RuntimeException {
}

/**
 * 継承関係のある例外をキャッチするcatchブロックの指定順について確認するための練習問題クラスです。
 * <p>
 * 例外クラスの継承関係と、catchブロックの並び順による動作の違いを学習します。
 */
public class Question06 {
    /**
     * executeメソッドを呼び出し、発生する例外をcatchブロックで処理します。
     * 継承関係のある例外を複数catchする場合、順序に注意が必要です。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        try {
            execute(5 % 2);
        } catch (SubFirstException | SecondException e) {
            System.out.println("SubFirst | Second");
        } catch (FirstException e) {
            System.out.println("First");
        } catch (Exception e) {
            System.out.println("Ex");
        }
    }

    /**
     * 引数に応じて異なる例外をスローします。
     *
     * @param value 判定用の値
     * @throws Exception 例外
     */
    public static void execute(int value) throws Exception {
        switch (value) {
            case 1 -> throw new FirstException();
            case 2 -> throw new SubFirstException();
            case 3 -> throw new SecondException();
            default -> throw new RuntimeException();
        }
    }
}
