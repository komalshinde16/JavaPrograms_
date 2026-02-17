package com.itshaala.ArraysRevision;

public class LinearSearch {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int x = 500;
        boolean found = false;
        for(int i =0; i< array.length; i++){
            if(array[i]==x){
                found = true;
                break;
            }
        }
        System.out.println(found ? "element found" : "element not found");
    }


}
