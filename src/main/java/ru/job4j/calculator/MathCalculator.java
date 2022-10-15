package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }
    public static double difAndDiv(double second, double first) {
        return dif(second, first)
                + div(second, first);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + difAndDiv(40, 20));
        System.out.println("Результат расчета равен: " + fin(30, 200,20, 2));
    }
}

