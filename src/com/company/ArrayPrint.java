package com.company;

import java.util.Arrays;

public class ArrayPrint {
    public static void main(String[] args) {
        int [] number = {2,5,7,8,6,4,3,9};

        //first way of print with for loop
//        for (int i = 0; i< number.length; i ++){
//            System.out.print(number[i]+" ");
//        }
        System.out.println(Arrays.toString(number));
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        Arrays.fill(number,2,5,6);//(number,0)
        System.out.println(Arrays.toString(number));
    }
}
