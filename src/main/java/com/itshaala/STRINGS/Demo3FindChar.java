package com.itshaala.STRINGS;

public class Demo3FindChar {
    public static void main(String[] args) {
        //find
        char[] array = {'G', 'O', 'O', 'D', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        char x = 'G';
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "found" : "not found");
    }
}
