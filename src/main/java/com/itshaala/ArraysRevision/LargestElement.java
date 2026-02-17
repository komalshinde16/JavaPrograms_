package com.itshaala.ArraysRevision;

public class LargestElement {
    public static void main(String[] args) {
        int [] array = {5,12,1};
        int max = array[0] ;

        for(int i = 1; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }

        }
        System.out.println(max);
    }
}
