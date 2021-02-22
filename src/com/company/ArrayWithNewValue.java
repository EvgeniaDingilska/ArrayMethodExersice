package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithNewValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbers = {5,7,8,7,3,8,7};
        System.out.println("Please write the value position");
        int valPosi = scan.nextInt();
        System.out.println("Please write the value");
        int value = scan.nextInt();

        numbers[valPosi] = NewValue(numbers,value,valPosi);
        System.out.println(Arrays.toString(numbers));


    }
    static int NewValue(int []a, int val, int pos){
     return a[pos] = val;
    }
}
