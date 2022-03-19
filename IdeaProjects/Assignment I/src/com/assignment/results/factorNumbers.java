package com.assignment.results;

import java.util.Scanner;

public class factorNumbers {
    public static void main(String[]args){
        int i,x,fact=1;
        Scanner read;
        read=new Scanner(System.in);
        System.out.println("Enter the value x");
        x=read.nextInt(); {
            for(i=1;i<=x;i++) {
                fact=fact*i;
            }
        }
        System.out.println(fact);
    }

}

