package com.itshaala.Revision16;

public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] array ={1,2,3,2,1,5};
        boolean isPalindrome = true;

        for(int i=0; i< array.length; i++){
            if(array[i]!= array[array.length-1-i]){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("array is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
