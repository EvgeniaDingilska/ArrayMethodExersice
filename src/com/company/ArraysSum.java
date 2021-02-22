package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello to calculate the sum in an arrays!");
        System.out.print("Please write the lenght of the array:");
        int[] numbers = new int[scan.nextInt()];
        System.out.println("Please write " + numbers.length + "numbers!");
        int sum = 0;
        for (int i = 0 ; i<numbers.length; i++){
            numbers[i] = scan.nextInt();
        }
        sum = SumOfArray(numbers);
        System.out.println("The sum is : "+ sum);
        // First way of calculation.
//        int [] numbers = {5,5,4,2,2,8};
//        int sum = 0;
//        for (int i =0; i< numbers.length; i++){
//            sum += numbers[i];
//        }
//
//        System.out.println("The sum is: "+sum);
        scan.close();
    }

    static int SumOfArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        return sum;
    }
}
