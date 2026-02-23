package com.itshaala.Feb21;

public class SecondMin {
    public static void main(String[] args) {
        int[] arr = {12,5,4,512,87,45,65};
        int min = arr[0];
        int secondMin = arr[1];

        for(int i=0; i< arr.length; i++){
            if(arr[i]<min){
                secondMin = min;
                min = arr[i];
            } else if (arr[i]< secondMin && arr[i] != min) {
                secondMin = arr[i];

            }
        }
        System.out.println("second min is : " +secondMin);
    }
}

