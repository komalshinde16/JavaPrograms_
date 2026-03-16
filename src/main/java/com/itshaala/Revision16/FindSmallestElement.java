package com.itshaala.Revision16;

public class FindSmallestElement {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90};

        int min = array[0];
        for(int i=0; i< array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
