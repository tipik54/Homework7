package ru.kaznu.ruslan.lesson8;

public class HW3 {
    static final int SIZE = 8;

    public static void main(String[] args) {

        printSquare(SIZE);
    }

    public static void printSquare(int size) {
        // Цикл  печати квадрата из *
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println(); // переход на новую строку после печати предыдущей
        }
    }
}

