package com.itshaala.ARRAYS;

public class Demo7PrintingReverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        //reverse order printing for index : length-1 to 0

        for(int i= array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
