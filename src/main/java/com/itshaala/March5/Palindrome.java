package com.itshaala.March5;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Komal";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }
}
