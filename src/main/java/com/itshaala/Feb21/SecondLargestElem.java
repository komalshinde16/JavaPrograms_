package com.itshaala.Feb21;

public class SecondLargestElem {
    public static void main(String[] args) {
        int [] arr = {4,8,4,5,1,6,1,7,3,1};

        int max = arr[0];
        int secondMax = arr[1];

        for(int i =0; i< arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i]>secondMax&& arr[i]!=max) {
                secondMax = arr[i];

            }
        }
        System.out.println(secondMax);
    }
}
