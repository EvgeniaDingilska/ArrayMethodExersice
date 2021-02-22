package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCompare {
    public static void main(String[] args) {
        int [] numbers = {2,8,5,2,5,8,5,9,7};
        int [] numbers2 = {2,8,5,2,5,8,5,9,7};

        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
        String[] nameArray = new String[]{"John", "Mark", "Joe", "Bill", "Connor"};

        List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
        List<String> nameList = new ArrayList<>(Arrays.asList(nameArray));

        System.out.println(intList.contains(1));
        System.out.println(nameList.contains("John"));


        if (Arrays.equals(numbers2,numbers)){
            System.out.println("same");
        }else{
        System.out.println("not same");}
    }
}
