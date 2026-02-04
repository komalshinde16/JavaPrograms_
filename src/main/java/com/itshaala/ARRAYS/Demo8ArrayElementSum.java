package com.itshaala.ARRAYS;

public class Demo8ArrayElementSum {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int sum = 0;

        for(int i = 0; i<array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of the above elements is :" +sum) ;
    }
}
