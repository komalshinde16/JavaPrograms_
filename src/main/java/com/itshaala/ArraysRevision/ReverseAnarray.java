package com.itshaala.ArraysRevision;

public class ReverseAnarray {
    public static void main(String[] args) {
        int[] array = {5, 12, 1};

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
