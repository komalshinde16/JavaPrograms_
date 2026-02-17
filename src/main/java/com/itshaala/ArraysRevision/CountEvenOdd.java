package com.itshaala.ArraysRevision;

public class CountEvenOdd {
    public static void main(String[] args) {
        int [] array = {42,4,5,8,9,6,4,2};
        int even = 0;
        int odd = 0;

        for(int i =0; i< array.length;i ++){
            if(array[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
