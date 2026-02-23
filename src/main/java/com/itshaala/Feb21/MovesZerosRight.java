package com.itshaala.Feb21;

public class MovesZerosRight {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 4, 0};
        int n = arr.length;

        int[] result = new int[n];
        int index = 0;   // start from left

        // Copy non-zero elements first
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        // Remaining positions will automatically be 0

        // Print result
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}



//✔ When element = 0 → program does nothing (just skips it)
//✔ When element ≠ 0 → program copies it to the left side in result
