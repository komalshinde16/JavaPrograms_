package com.itshaala.FEB24;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,5,4,2};
        Set<Integer> set = new LinkedHashSet<>();

        for(int num: arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
