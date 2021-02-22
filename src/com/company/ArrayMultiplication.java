package com.company;

import java.util.Arrays;

public class ArrayMultiplication {
    public static void main(String[] args) {
        int [] numbers = {5,8,9,7,6,7,8};
        int mult = 0;
        mult =  MultiplicationOfNumbers(numbers);
        System.out.println("The multiplicaton of numbers "+ Arrays.toString(numbers) +" is "+mult);

    }
    static int MultiplicationOfNumbers (int []a){
        int multiplication = 1;
        for(int i =0; i<a.length; i++){
            multiplication*=a[i];
        }
        return multiplication;
    }
}
