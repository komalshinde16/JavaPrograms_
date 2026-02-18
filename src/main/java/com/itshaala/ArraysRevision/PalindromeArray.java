package com.itshaala.ArraysRevision;

import com.itshaala.ARRAYS.Demo9LinearSearch;
import org.w3c.dom.ls.LSOutput;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 8, 1};
        boolean isPalindrome = true;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("array is palidrome");

        else {
            System.out.println("not palidrome");
        }
    }
}