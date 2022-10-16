package ru.job4j.math;

public class MathFunction {

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double dif(double first, double second) {
        return first - second;
    }

    public static double div(double first, double second) {
        return first / second;
    }

    public static double fin(double sum, double multiply, double dif, double div) {
        return sum + multiply + dif + div;
    }
}