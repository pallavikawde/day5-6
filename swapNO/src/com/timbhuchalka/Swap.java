package com.timbhuchalka;

import java.util.Scanner;
//create class
public class Swap {
    //use main methode
    public static void main(String[] args) {
//initialize value
        int a=10;
        int b=20;
        int t;
//swap value using third variable
        // t=a;
        //a=b;
        //b=t;

//to check output
        // System.out.println(a = +a);
        //System.out.println(b = +b);

        //swapping two number using scannner
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
         a = sc.nextInt();
        System.out.println("enter second number");
         b = sc.nextInt();
         //swapping number without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
//output
        System.out.println("swapped value is");
        System.out.println( a = +a);
        System.out.println(b = +b);
    }
}