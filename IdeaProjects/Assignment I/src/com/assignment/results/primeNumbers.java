package com.assignment.results;

import java.util.Scanner;

public class primeNumbers {
    public static void main(String[]args){
        Scanner h=new Scanner(System.in);
        int number,trucker=2;
        boolean isPrime=true;
        System.out.print("Enter number");
        number=h.nextInt();
        //use of for loop
        for(int i=(number-1); i>=2;i--){
            if(number%i==0)
                trucker++;
            if(trucker>2){
                isPrime=false;
                break;
            }


        }

        System.out.print(isPrime?"this is a prime number":"this is not a prime number");
    }
}
