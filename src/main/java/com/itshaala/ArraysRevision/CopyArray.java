package com.itshaala.ArraysRevision;

public class CopyArray {
    public static void main(String[] args) {

        int [] array = {10,20,30,40,50,60,70,80,90};
        int [] copy = new int[array.length];

        for(int i=0; i <array.length; i++){
            copy[i] = array[i];
        }
        System.out.println("copied array");
        for(int i =0; i< copy.length; i++){
            System.out.print(copy[i] + " ");
        }
    }
}
