package com.example.javasilver17.purple.practice.test01;

import java.util.List;

public class Question15 {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "8", "11", "17");
        for (var i = 0; i <= list.size(); i++) {
            try {
                Integer.parseInt(list.get(i));
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("loop " + i + " has finished");
            }
        }
    }
}
