package com.itshaala.Revision16;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90};
        int sum = array[0];
for(int i =0; i< array.length;i++){
    sum = sum + array[i];

}
        System.out.println(sum);
    }
}
