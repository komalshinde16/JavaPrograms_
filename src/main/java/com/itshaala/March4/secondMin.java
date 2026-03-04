package com.itshaala.March4;

public class secondMin {
    public static void main(String[] args) {
        int[] array ={1,2,3};
        int min = array[0];
        int secondMin = array[1];

        for(int i=0; i< array.length;i++){
            if(array[i]>min){
                secondMin = min;
                min = array[i];
            } else if (array[i]>secondMin && array[i]!=min) {
                secondMin = array[i];

            }
        }
        System.out.println(secondMin);
    }
}
