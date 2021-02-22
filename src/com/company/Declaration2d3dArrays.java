package com.company;

import java.util.Arrays;
import java.util.Random;


public class Declaration2d3dArrays {
    public static void main(String[] args) {
        //int[] grades = {2,4,5,5,4,6,3};
        Random ran = new Random();
        int[] grades = new int[5];

        for (int i =0; i< grades.length; i++){
            grades[i]=ran.nextInt(5)+2;//(5)= 0   -   4; (5)+2 =  [0+2 - 4+2];  [2-6] scope
        }                                     //    min    max//        min    max// final range

//        int[][] classes = {
//                {5,4,5,5,4,6,2},
//                {6,4,5,5,6,6,6},
//                {2,3,5,6,4,6,2,5,8},
//                {2,4,5,5,4,6,2,3}
//        };
         int [][] classes = new int[4][5];

        for (int i = 0; i<classes.length; i ++){//len = 4
            for (int j = 0; j<classes[i].length; j++){// len = 5
                classes[i][j]= ran.nextInt(5)+2;
            }
        }

//        int [][][] schools = {
//                {
//                        {2,4,5,5,4,6,3},
//                        {2,4,5,5,4,6,3},
//                        {2,4,5,5,4,6,3},
//                        {2,4,5,5,4,6,3},
//                        {2,4,5,5,4,6,3}
//                },
//                {
//                        {5,4,5,5,4,6,2},
//                        {6,4,5,5,6,6,6},
//                        {2,3,5,6,4,6,2},
//                        {2,4,5,5,4,6,2}
//                },
//
//                {
//                        {5,4,5,5,4,6,2},
//                        {6,4,5,5,6,6,6},
//                        {2,3,5,6,4,6,2},
//                        {2,4,5,5,4,6,2}
//                }
//        };
        int [][][] schools = new int[3][][];
        schools[0]= new int[4][5];
        schools[1]= new int[3][];
        schools[1][0] = new int[9];
        schools[1][1] = new int[2];
        schools[1][2] = new int[6];
        schools[2]= new int[3][6];

        for (int i =0; i< schools.length; i++){
            for (int j = 0; j<schools[i].length; j++){
                for (int k =0; k<schools[i][j].length; k++){
                    schools[i][j][k]= ran.nextInt(5)+2;
                }
            }
        }

//        System.out.println((Arrays.deepToString(schools)));
//        System.out.println(Arrays.toString(grades));//toString for 2d Array and deepToString for 3d Array
//        System.out.println(Arrays.deepToString(classes));
//        for (int i: grades){
//            System.out.print(i +" ");
//        }
        //Ordinary Array
        System.out.println("\n******************");
        for (int i = 0; i< grades.length; i++){
            System.out.print("["+grades[i]+"]");
        }
        System.out.println();
        System.out.println();
        // 2d Array
        for (int j = 0; j<classes.length; j++){
            for (int k=0; k<classes[j].length; k++){
                System.out.print(classes[j][k]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        ///3d Array
        for (int e =0; e<schools.length; e++){
            for (int v =0; v< schools[e].length; v++){
                for (int i =0; i<schools[e][v].length; i++){
                    System.out.print(schools[e][v][i]+" ");

                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
