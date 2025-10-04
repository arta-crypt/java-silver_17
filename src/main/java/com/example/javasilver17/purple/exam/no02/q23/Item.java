package com.example.javasilver17.purple.exam.no02.q23;

/**
 * sealedインターフェースの継承と実装に関するルールを問う型階層。
 * <p>
 * このインターフェースは、直接の実装/継承を{@link Food}と{@link Drink}に限定します。
 * sealedな型は、そのサブタイプを{@code permits}句で明示的に指定する必要があります。
 * </p>
 */
public sealed interface Item permits Food, Drink {
}

// 選択肢A
// コンパイルエラー：ItemでDrinkもpermitsしているため、DrinkでもItemを継承（extends/implements）しなければならない
// sealed interface Food extends Item permits Drink {}
// final class Drink implements Food {}

// 選択肢B
// コンパイルエラー：ItemでFoodもpermitsしているため、FoodでもItemを継承（extends/implements）しなければならない
// さらに、インターフェースにインターフェースはimplementsできない
// sealed interface Food extends Item {}
// non-sealed interface Drink implements Food {}

// 選択肢C
// コンパイル成功
/**
 * {@link Item}を継承するsealedインターフェース。
 * <p>
 * sealedインターフェースを継承する型は、{@code sealed}, {@code non-sealed}, または {@code final}
 * のいずれかでなければなりません。
 * ここでは{@code sealed}を宣言し、自身のサブタイプを{@link Drink}に限定しています。
 * </p>
 */
sealed interface Food extends Item permits Drink {
}

/**
 * {@link Food}と{@link Item}を実装するfinalなrecord。
 * <p>
 * recordクラスは暗黙的に{@code final}であり、sealed階層の末端になることができます。
 * {@code permits}句で許可された型は、その親インターフェースを必ず実装または継承しなければなりません。
 * </p>
 */
record Drink() implements Food, Item {
}

// 選択肢D
// コンパイルエラー：non-sealedクラスはpermitsできない
// non-sealed class Food extends Item permits Drink {}
// final class Drink extends Food implements Item {}

// 選択肢E
// コンパイルエラー：interfaceにfinalはつけられない
// sealedクラスにはサブクラスが必要
// final interface Food extends Item {}
// sealed class Drink implements Item {}