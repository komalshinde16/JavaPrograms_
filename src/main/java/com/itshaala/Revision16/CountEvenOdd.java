package com.itshaala.Revision16;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90,3};
        int even =0;
        int odd =0;

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
