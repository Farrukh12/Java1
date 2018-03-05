package com.company;

import java.util.Scanner;
import java.util.Arrays;

/*
2. first - первый
3. last - последный
 */
public class Main {
    public static void main(String[] args) {
        int number, array[],numberForSearch, firstIndex, lastIndex;
        Scanner input = new Scanner(System.in);
        System.out.print("Количество элементов массива:");
        number = input.nextInt();
        // Создаем массив введеного ползователем
        array = new int[number];
        System.out.print("Введите " + number + " число:");
        for (int i = 0; i <= number; i++) {
            array[i] = input.nextInt();
        }
        /*Сортируем элементы массива для бинарного поиска*/
        Arrays.sort(array);
        System.out.println("Введите элемент для бинарного поиска");
        numberForSearch = input.nextInt();
        firstIndex = 0;
        lastIndex = number - 1;
    }
}
