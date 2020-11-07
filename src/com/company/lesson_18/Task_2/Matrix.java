package com.company.lesson_18.Task_2;

import java.util.Arrays;

public class Matrix {
    private int [][] elements;
    private int rows;
    private int columns;

public Matrix (int [][] elements){
    this.elements = elements;
    rows = elements.length;
    columns = rows;
}
public int [][] getElements (){
    return elements;
}
public int getRows (){
    return rows;
}
public int getColumns(){
    return columns;
}
public Matrix sum (Matrix matr){
    int [][] arr = new int [rows][];
    for (int i=0; i<arr.length;i++){
        int [] temp =new int[columns];
        for (int j=0; j<temp.length;j++){
            temp [j] = matr.getElements()[i][j] + this.getElements()[i][j];
        }
        arr [i] = temp;
    }
    return new Matrix(arr);
}

    @Override
    public String toString() {
        String e ="";
        for (int i = 0; i<elements.length; i++){
            for (int j = 0; j<elements[i].length;j++){
                e += elements[i][j] + " ";
            }
            e +="\n";
        }
        return "Matrix{\n" + e + '}';
    }
}
