package ru.kaznu.ruslan.lesson8;

public class HW3 {
    public static void main(String[] args) {
        // Реализуйте метод, который считает сумму
        // элементов второй строки двумерного массива,
        // если второй строки не существует, то в качестве результата необходимо вернуть -1
        int[][] array = {{0, 2}};

        sumSecondRow(array);
    }

    public static void sumSecondRow(int[][] array) {
        int sum = 0;

        if (array.length > 1) { // Задаем условие по которому количество строк должно быть равно минимум 2
            for (int j = 0; j < array[1].length; j++) { // array[1].length прописываем чтобы цикл проводил счет по второй строке массива
                sum += array[1][j]; // Суммируем элементы второй строки
            }
            System.out.println(sum); // Выводим сумму в консоль
        } else {
            System.out.println("-1"); // Если условие не выполняется в консоль выписывается -1
        }
    }
}

