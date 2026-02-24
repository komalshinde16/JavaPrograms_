package com.itshaala.FEB24;

public class right {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;

        k = k % n;   // Important step

        int[] result = new int[n];
        int index = 0;

        // Step 1: Copy last k elements
        for(int i = n - k; i < n; i++) {
            result[index++] = arr[i];
        }

        // Step 2: Copy remaining elements
        for(int i = 0; i < n - k; i++) {
            result[index++] = arr[i];
        }

        // Print result
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
