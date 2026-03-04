package com.itshaala.March4;

public class Secondmax {
    public static void main(String[] args) {
        int[] array ={1,2,3};
        int max = array[0];
        int secondMax = array[1];

        for(int i=0; i< array.length;i++){
            if(array[i]>max){
                secondMax = max;
                max = array[i];
            } else if (array[i]>secondMax && array[i]!=max) {
                secondMax = array[i];

            }
        }
        System.out.println(secondMax);
    }

}
