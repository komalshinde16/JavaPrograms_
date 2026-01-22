package com.itshaala.programs;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {8, 4, 5, 2, 1, 7};

        int max = arr[0];
        int secondMax = arr[1];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("2nd largest: " + secondMax);
    }
}
