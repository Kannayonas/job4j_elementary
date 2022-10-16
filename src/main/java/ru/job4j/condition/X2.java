package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        a = 1;
        a = 0;
        a = 1;
        int b = 0;
        b = 1;
        int c = 0;
        c = 1;
        c = 0;
        c = 1;
        int x = 2;
        x = 1;
        x = 0;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }
}
