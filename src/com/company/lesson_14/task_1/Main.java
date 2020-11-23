package com.company.lesson_14.task_1;

import java.util.Scanner;

public class Main {

//    Спросить у ПЗ(пользователя) размер массива, после попросить
//    заполнить массив поэлементно.
//    Переставить элементы массива в обратном порядке и показать получившийся массив ПЗ.

    public static void main(String[] args) {

        task1();
    }

    //основной метод для задачи
    private static void task1() {
        int size = getIntFromConsole("Set the size of the array");
        int[] array = getUserArray(size);
        showArray(array);
        System.out.println("After reversing: ");
        int[] reversedArray = reverseArray(array);
        showArray(reversedArray);
    }

    //metod dlya chteniya chisla
    private static int getIntFromConsole(String text) {
        System.out.println(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    //метод, возвращаяющий массив из n элементов
    private static int[] getUserArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = getIntFromConsole("Enter the " + (i + 1) + " element");
        }
        return result;
    }

    //метод, выводящий на экран созданный массив
    private static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[ " + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.println(array[i] + " ]");
            } else
                System.out.print(array[i] + ", ");
        }
    }

    //метод, возвращающий массив с переставленными в обратном порядке элементами
    private static int[] reverseArray(int[] array){
        for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }


}
