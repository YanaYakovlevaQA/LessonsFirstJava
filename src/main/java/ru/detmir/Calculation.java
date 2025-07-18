package ru.detmir;

public class Calculation {
    public static void main(String[] args) {

        // Применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int a = 29;
        int b = 27;

        System.out.println(a + b);
        System.out.println(b - a);
        System.out.println(b * a);
        System.out.println(a / b); // целочисленное деление
        System.out.println(a % b); //остаток от деления
        System.out.println((b - a) * a);
    }
}
