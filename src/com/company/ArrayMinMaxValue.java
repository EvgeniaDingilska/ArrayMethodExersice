package com.company;

import java.util.Arrays;

public class ArrayMinMaxValue {

    public static void main(String[] args) {
        int [] numbers = {10,2,58,8,7,3,0,57,888,4475,64,2,1};
        int [][] numbers2 = {
                {2,5,8,7,9},
                {6,84,548,12,6},
                {2,5,8,7,9,45,5}
        };
        int min = numbers[0];
        int min1 = numbers2[0][0];
        int max= numbers[0];
        int max1= numbers2[0][0];

        for (int i = 0; i< numbers2.length; i++){
            for(int j = 0; j<numbers2[i].length; j++){
                if (numbers2[i][j]>max1){
                    max1 = numbers2[i][j];
                }if (numbers2[i][j]<min1){
                    max1 = numbers2[i][j];
                }
            }
        }
//        for (int i =0; i<numbers.length; i++){
//            if (numbers[i] > max){
//                max = numbers[i];}
//            }if (numbers[i]<min){
//                min=numbers[i];}
//            }
        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("The min value is: "+numbers[0] +" , max value is: "+ numbers[numbers.length-1]);
        System.out.println(min1 +" "+ max1);
        }
        //System.out.printf("The min value is %d and the max value is %d",min,max);

    }

