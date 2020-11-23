package com.company.lesson_14.task_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MetToMat {
    public static void main(String[] args) {
        task2();
    }

    private static void task2(){
        String line = inputStringFromConsole("Type some text");
        String[] arrayDevidedByThree = getArrayWithThreeSymbols(line);
        System.out.println(arrayDevidedByThree);
    }

    public static String inputStringFromConsole(String textOfTask){
        System.out.println(textOfTask);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }

    public static String[] getArrayWithThreeSymbols (String line){
        String[] fragments = new String[line.length() / 3];
        return fragments;
    }
}
