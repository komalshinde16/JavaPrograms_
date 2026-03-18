package com.itshaala.Revision16;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 20, 40, 10, 50};

        HashSet <Integer> set = new HashSet<>();

        for(int num : array){
            if(!set.add(num)){
                System.out.println(num);
            }
        }
    }
}
