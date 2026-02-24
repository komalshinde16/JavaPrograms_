package com.itshaala.FEB24;

public class LeftRotation {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;

        int[] result = new int[n];

        // Step 1: Copy elements from k to end
        int index = 0;
        for(int i = k; i < n; i++) {
            result[index++] = arr[i];
        }

        // Step 2: Copy first k elements
        for(int i = 0; i < k; i++) {
            result[index++] = arr[i];
        }

        // Print result
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
