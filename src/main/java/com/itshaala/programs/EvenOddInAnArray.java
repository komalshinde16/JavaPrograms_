package com.itshaala.programs;

public class EvenOddInAnArray {
    public static void main(String[] args) {
        int [] arr = {4,5,1,2,8,7,5,1,1};
        int even = 0;
        int odd = 0;

        for(int i = 0; i <arr.length; i++) {
            if (arr[i] % 2 == 0) {
            even++;
        }
        else {
                odd++;

            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
