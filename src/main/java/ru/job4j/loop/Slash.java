package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                int left = row + cell;
                int right = size - (row + cell);
                if (left % 2 == 0 && cell - row == 0) {
                    System.out.print("0");
                } else if (right == 1) {
                        System.out.print("0");
                    } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}