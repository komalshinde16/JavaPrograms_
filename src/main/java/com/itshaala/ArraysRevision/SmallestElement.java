package com.itshaala.ArraysRevision;

public class SmallestElement {
    public static void main(String[] args) {
        int [] array = {5,12,1};
        int min = array[0] ;

        for(int i = 1; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }

        }
        System.out.println(min);
    }
}

