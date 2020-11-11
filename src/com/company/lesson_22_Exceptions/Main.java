package com.company.lesson_22_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            method();
        } catch (InputMismatchException r){
            System.out.println("Es gitb ein Fehler in Ihrem Code");
        }


        try {
            method2();
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("Can not find a file. Please, check the link to the file.j");
        }
    }

    public static void method() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
//        try{
            int n = sc.nextInt();
//        } catch(Exception e){
//            System.out.println("Es gitb ein Fehler in Ihrem Code");
//        }

        System.out.println("Program ist beendet. Du hast den nummer geschrieben");
    }
    public static void method2() throws FileNotFoundException {
        FileReader fileReader = new FileReader("text.txt");

        System.out.println("Program ist beendet. Du hast den nummer geschrieben");
    }
}
