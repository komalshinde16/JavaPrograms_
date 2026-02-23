package com.itshaala.Feb21;

public class FirstMininArray {
    public static void main(String[] args) {
        int[] arr = {12,5,4,512,87,45,65};
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min element is : " +min);
    }
}
