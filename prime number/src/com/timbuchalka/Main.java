package com.timbuchalka;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int no =10;
        int temp=0;
        for (int i = 2; i <= no - 1; i++) {
            if (no%i==0){
                temp=temp+1;

        }}
            if(temp==0){
                System.out.println("number is prime");
    }else{
                System.out.println("no is not prime");
            }
}}