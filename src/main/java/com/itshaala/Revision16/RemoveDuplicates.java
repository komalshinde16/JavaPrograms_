package com.itshaala.Revision16;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90,20};

        Set <Integer> set = new LinkedHashSet<>();
        for(int num : array){
            set.add(num);
        }
        System.out.println(set);
    }
}
