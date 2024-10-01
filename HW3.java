package ru.kaznu.ruslan.lesson8;

public class HW3 {
    public static void main(String[] args) {
        // Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
        int[][] array = {{1, 2, 3}, {9, 5, 6}, {7, 8, 4}};

        int maxElement = findMax(array);
        System.out.println("Наибольший элемент массива: " + maxElement);
    }

    public static int findMax(int[][] array) {
        // Задаем начальное значение максимума для сравнения элементов массива с ним
        int max = array[0][0];

        // При помощи цикла сравниваем каждый элемент массива и обновляем данные переменной int max
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        return max; //возвращаем переменную max
    }
}


