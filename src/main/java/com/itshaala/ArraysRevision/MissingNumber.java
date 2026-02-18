package com.itshaala.ArraysRevision;

public class MissingNumber {
    public static void main(String[] args) {
        int [] array = {1,2,4,5};
        int n = array.length +1;

        int totalSum = n * (n+1)/2;
        int arrSum = 0;

        for(int i =0; i< array.length; i++){
            arrSum = arrSum + array[i];
        }
        int Missing = totalSum - arrSum;

        System.out.println(Missing);
    }
}
