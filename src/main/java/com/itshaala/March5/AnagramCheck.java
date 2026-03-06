package com.itshaala.March5;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("anagram");
        } else{
            System.out.println("not anagram");
        }
    }
}
