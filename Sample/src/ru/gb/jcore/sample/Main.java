package ru.gb.jcore.sample;

import ru.gb.jcore.regular.OtherClass;

/**
 * Основной класс приложения
 */
public class Main {
    /**
     * Точка входа в программу
     */
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int result = OtherClass.sum(2, 2);
        System.out.println(OtherClass.decorate(result));
    }
}
