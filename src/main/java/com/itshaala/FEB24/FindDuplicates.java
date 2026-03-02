package com.itshaala.FEB24;

public class FindDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,5,4,2};
        int n = arr.length;

        System.out.println("duplicates elements are : ");

        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
