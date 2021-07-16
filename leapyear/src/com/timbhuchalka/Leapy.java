package com.timbhuchalka;

import java.util.Scanner;

//create class
public class Leapy {
//use main methode
    public static void main(String[] args) {
        //initialize value
        //int year = 2003;
        //use if else conditions
       // if ((year % 400 == 0) || (year % 4 == 0 && year %100 != 0)){
            System.out.println("leap year");

      //  }else{
         //   System.out.println("not a leap year");
       // }


        //using scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year");
        int year=sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year %100 != 0)){
            System.out.println("leap year");

        }else{
            System.out.println("not a leap year");
        }




    }
}