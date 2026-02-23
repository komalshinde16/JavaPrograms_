package com.itshaala.Feb21;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {12,5,4,512,87,45,65};
        int max = arr[0];
        int secondMax = arr[1];

        for(int i=0; i< arr.length; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i]> secondMax && arr[i] != max) {
                secondMax = arr[i];

            }
        }
        System.out.println("second max is : " +secondMax);
    }
}
