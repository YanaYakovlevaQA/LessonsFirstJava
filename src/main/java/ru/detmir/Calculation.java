package ru.detmir;

public class Calculation {
    public static void main(String[] args) {

        // Применение нескольких арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int a = 29;
        int b = 27;

        System.out.println(a + b);
        System.out.println(b - a);
        System.out.println(b * a);
        System.out.println(a / b); // целочисленное деление
        System.out.println(a % b); //остаток от деления
        System.out.println((b - a) * a);

        // Применение нескольких арифметических операций над int и double в одном выражении
        double c = 1.29;
        int d = 1;
        int e = 2;
        System.out.println((d + e) * c / e);

        // Применение нескольких логических операций ( < , >, >=, <= )

        if (a > b){
            System.out.println((a - b) > 0);
        }

        if (a > b){
        System.out.println(!((a - b) > 0));
        }

        System.out.println((d + e) != 3);

        // Диапазоны типов данных для вещественных / чисел с плавающей точкой
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        //Переполнение при арифметической операции
        System.out.println(Double.MAX_VALUE * 2);
        System.out.println(Float.MIN_VALUE / 2f);
    }
}
