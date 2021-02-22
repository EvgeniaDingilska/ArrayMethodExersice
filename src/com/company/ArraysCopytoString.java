package com.company;

import java.util.Arrays;

public class ArraysCopytoString {

    public static void main(String[] args) {
        int bookCodeLibraly[]={77,22,66,44,11};
        int []arrayCopy = Arrays.copyOf(bookCodeLibraly,bookCodeLibraly.length);
        System.out.println("Array of code: " +Arrays.toString(arrayCopy));
        for (int i : bookCodeLibraly){
        }
    }
}
