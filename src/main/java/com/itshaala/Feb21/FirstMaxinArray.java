package com.itshaala.Feb21;

public class FirstMaxinArray {
    public static void main(String[] args) {
        int[] arr = {12,5,4,512,87,45,65};
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
           if(arr[i]>max){
               max = arr[i];

            }
        }
        System.out.println("maximum element in the array is :" +max);
    }
}
