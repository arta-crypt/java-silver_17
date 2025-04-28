package com.example.javasilver17.knowledge.constructor;

class Animal {
    Animal() {
        System.out.println("Run Animal constructor!");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Run Dog constructor!");
    }

}

class UMA extends Animal {
}

public class ConstructorChaining {

    public static void main(String... args) {
        Dog dog = new Dog();
        UMA uma = new UMA();
    }
}
