package com.timbhuchalka;

public class Fibonacci {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        for(int i=1;i<10;i++){
            c=a+b;
            System.out.println("enter number =" +c);
            a=b;
            b=c;
        }

    }
}
