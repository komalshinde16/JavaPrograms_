package com.itshaala.Revision16;

public class SecondSmallestinArray {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90};
        int min = array[0];
        int secondMin = array[1];

        for(int i= 0; i< array.length;i++){
            if(array[i]<min){
                secondMin = min;
                min = array[i];

            }
            else if(array[i]<secondMin && array[i]!= min){
                secondMin = array[i];
            }


        }
        System.out.println(secondMin);
    }
}
