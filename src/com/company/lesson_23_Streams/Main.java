package com.company.lesson_23_Streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    try (FileReader fr = new FileReader("C:\\Users\\Home\\OneDrive\\Рабочий стол\\JAVA SE Projects\\classwork\\src\\com\\company\\lesson_23_Streams\\text1.txt")){
        int character = fr.read();
        while (character != -1){
            System.out.println((char) character);
            character = fr.read();
        }
    }catch (FileNotFoundException e){
        e.printStackTrace();
    }catch (IOException e){
        e.printStackTrace();
    }

    try(
            FileWriter fw = new FileWriter("C:\\Users\\Home\\OneDrive\\Рабочий стол\\JAVA SE Projects\\classwork\\src\\com\\company\\lesson_23_Streams\\text2.txt")
            ){
        String myString = fr.read();
        fw.write(myString);
    }catch(IOException e){
        e.printStackTrace();
    }
}
