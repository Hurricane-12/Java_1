package ru.makarichev.java1.lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int n = 7;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println();
        checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1});

        System.out.println();
        scrollArray(new int[]{2, 2, 2, 1, 2, 2, 10, 1}, -3);

    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой
    // и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
    // эти символы в массив не входят.
    public static void checkBalance(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return;
        }
        int sumLeftNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            sumLeftNumbers += arr[i];
            if (sumLeftNumbers * 2 == sum) {
                System.out.println("Есть баланс");
                return;
            } else if (sumLeftNumbers * 2 > sum) {
                System.out.println("Нет баланса");
                return;
            }
        }
        System.out.println("Нет баланса");
    }

    //7. Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен сместить
    // все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.

    public static void scrollArray(int[] arr7, int n) {
        System.out.println(Arrays.toString(arr7));
        n = n % arr7.length;  // Убираем избыточные повороты
        if (n < 0)  // "Переводим" повороты влево в повороты вправо
            n += arr7.length;
        for (int i = 0; i < n; i++) {  // Пишем цикл для перевода на n элементов вправо
            int LastArrayElement = arr7[arr7.length - 1];
            for (int j = arr7.length - 1; j >= 1; j--) {
                arr7[j] = arr7[j - 1];
            }
            arr7[0] = LastArrayElement;
        }
        System.out.println(Arrays.toString(arr7));
    }
}
