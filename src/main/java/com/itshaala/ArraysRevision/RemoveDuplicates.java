package com.itshaala.ArraysRevision;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] array = {1,2,2,3,4,4,5,8,8};

        Set<Integer> set = new LinkedHashSet<>();

        for(int num : array){
            set.add(num);
        }
        System.out.println(set);
    }
}
