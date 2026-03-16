package com.itshaala.Revision16;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90};
        int max = array[0];
        int SecondMax = array[1];

        for(int i= 0; i< array.length;i++){
            if(array[i]>max){
                SecondMax = max;
                max = array[i];

            }
            else if(array[i]> SecondMax && array[i]!= max){
                SecondMax = array[i];
            }


        }
        System.out.println(SecondMax);
    }
}
