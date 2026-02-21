package com.itshaala.Feb21;

public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 8, 1};
        boolean isPalindrome = true;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("yes it is palindrome");
        } else {
            System.out.println("no it is not palindrome");

        }
    }
}
