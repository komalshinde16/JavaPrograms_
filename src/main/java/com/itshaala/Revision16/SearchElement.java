package com.itshaala.Revision16;

public class SearchElement {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90};
        int num = 300;
        boolean found = false;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == num) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
