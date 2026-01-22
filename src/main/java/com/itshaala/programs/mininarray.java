package com.itshaala.programs;

public class mininarray {
    public static void main(String[] args) {
        int [] arr = {8,4,5,1,2,4,9,1,2,4};
        int min = arr [0];

        for(int i = 1; i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min element in the set of array is : " +min);
    }
}
