package com.itshaala.ARRAYS;

public class Demo21EvenOddCount {
    public static void main(String[] args) {
        int []array = {4,7,1,21,56,45,10};
        int even = 0;
        int odd = 0;

        for(int i= 0; i<array.length; i++){
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
