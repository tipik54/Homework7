package ru.kaznu.ruslan.lesson8;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        //Реализовать метод sumOfPositiveElements(..)
        // принимающий в качестве аргумента целочисленный двумерный массив,
        // метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
        int[][] array = {{1, -2}, {1, 2}, {1, 2}, {1, 2}};
        arraySumElements(array);
    }

    public static void arraySumElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int value = array[i][j];
                if (value > 0) {
                    sum += value;
                }
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
