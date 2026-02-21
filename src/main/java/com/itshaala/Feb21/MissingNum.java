package com.itshaala.Feb21;

public class MissingNum {
    public static void main(String[] args) {
       int [] array = {1,2,3,5};
       int n = array.length +1;

       int totalSum = n*(n+1)/2;
       int arrSum = 0;

       for(int i =0; i< array.length; i++){
           arrSum += array[i];
       }
       int Missing = totalSum - arrSum;
        System.out.println(Missing);
    }
}
