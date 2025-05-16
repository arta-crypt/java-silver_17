package com.example.javasilver17.knowledge.interning;

public class InterningSample {
    public static void main(String... args) {
        String s_literal1 = "Hello";
        String s_literal2 = "Hello";
        String s_new1 = new String("Hello");
        String s_new2 = new String("Hello");
        String s_intern1 = s_literal1.intern();
        String s_intern2 = s_new1.intern();

        System.out.println(s_literal1 == s_literal2); // true
        System.out.println(s_new1 == s_new2); // false
        System.out.println(s_intern1 == s_intern2); // false -> true : intern() は「同じ内容のリテラル（文字列プール）」を返す
        System.out.println(s_literal1 == s_new1); // false
        System.out.println(s_literal1 == s_intern1); // true
        System.out.println(s_new1 == s_intern1); // true
    }
}
