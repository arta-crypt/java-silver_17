package com.example.javasilver17.knowledge.recordclass;

/**
 * イベントの開始を表す空のレコード。
 * <p>
 * 状態を持たず、イベントの種類を型として表現するために使用されます。
 * </p>
 */
record StartEvent() {
}

/**
 * イベントの停止を表す空のレコード。
 * <p>
 * 状態を持たず、イベントの種類を型として表現するために使用されます。
 * </p>
 */
record StopEvent() {
}

/**
 * 空のレコードを使用してイベント処理を行うクラス。
 * <p>
 * このクラスは、{@link StartEvent}や{@link StopEvent}のような
 * 型情報のみを持つ空のレコードを処理する方法を示します。
 * </p>
 */
public class EmptyRecord {
    /**
     * 指定されたイベントオブジェクトを処理します。
     * <p>
     * イベントの型を{@code instanceof}で判定し、
     * 型に応じたメッセージを標準出力に出力します。
     * </p>
     *
     * @param event 処理対象のイベントオブジェクト。{@link StartEvent}または{@link StopEvent}を想定。
     */
    void process(Object event) {
        if (event instanceof StartEvent) {
            System.out.println("Start!");
        } else if (event instanceof StopEvent) {
            System.out.println("Stop!");
        }
    }

    /**
     * {@code EmptyRecord}クラスの実行エントリーポイント。
     * <p>
     * {@link StartEvent}を生成し、{@link #process(Object)}メソッドで処理するデモを行います。
     * </p>
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        EmptyRecord er = new EmptyRecord();
        er.process(new StartEvent());
    }
}