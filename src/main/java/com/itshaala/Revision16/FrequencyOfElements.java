package com.itshaala.Revision16;

import java.util.HashMap;


public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] array = {10, 20, 10, 30, 20, 10};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: array){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }
}
