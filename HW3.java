package ru.kaznu.ruslan.lesson8;

public class HW3 {

    final static int SIZE = 5;

    public static void main(String[] args) {
        //Реализовать метод, принимающий в качестве аргумента
        // двумерный целочисленный массив, и зануляющий его диагональные
        // элементы (можете выбрать любую из диагоналей, или занулить обе);
        char[][] array = new char[SIZE][SIZE];

        setZeroDiagonal(array);
    }

    public static void setZeroDiagonal(char[][] array) {
        // Заполнение массива * и его отрисовка
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[i][j] = '*';
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        // Цикл зануления диагоналей
        for (int i = 0; i < SIZE; i++) {

            array[i][i] = 0; //Зануление первой диагонали
            array[i][SIZE - 1 - i] = 0; // зануление второй диагонали

            for (int j = 0; j < SIZE; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

