package com.itshaala.programs;

public class SecondMin {
    public static void main(String[] args) {

        int[] arr = {8, 4, 5, 2, 1, 7};

        int min = arr[0];
        int secondMin = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        System.out.println("2nd minimum element: " + secondMin);
    }
}
