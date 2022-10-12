package ru.job4j.calculator;

public class Test1 {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Test1.plus(100, 500);
        Test1.plus(4, 2);
        Test1.plus(3, 5);
    }
}

