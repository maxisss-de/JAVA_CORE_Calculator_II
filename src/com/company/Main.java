package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);   // (x, y) -> x + y  ответ а 3; метод apply() это скорее всего метод который вызывается от этих типов данных: BinaryOperator<Integer> plus в классе Calculator
        int b = calc.minus.apply(1, 1);  // (x, y) -> x - y ответ b 0; метод apply() это скорее всего метод который вызывается от этих типов данных: BinaryOperator<Integer> minus в классе Calculator
        try {
            int c = calc.devide.apply(a, b);      // a / b ответ с); метод apply() это скорее всего метод который вызывается от этих типов данных: BinaryOperator<Integer> devide в классе Calculator
            calc.println.accept(c);   // Деление на ноль нельзя
        } catch (ArithmeticException exception) {
            System.out.println("Делить на ноль нельзя");
        }
    }
}