package com.itshaala.ARRAYS;

public class Demo11MinElement {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int min = array[0];

        for(int i =1; i< array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Minimun element from the array is : " +min);
    }
}
