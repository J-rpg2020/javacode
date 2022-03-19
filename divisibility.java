package com.assignment.results;
import java.util.Scanner;

public class divisibility {
    public  static void main(String[]args){
        int number;
        Scanner read;
        read=new Scanner(System.in);
        System.out.println("Enter a number");
        number=read.nextInt();
            if(number%3==0&&number%5==0)
               System.out.println("fizzbuzz");
            else if(number%5==0)
                System.out.println("buzz");
            else if (number%3==0)
                System.out.println("fizz");
            else
                System.out.println("Not divisible by any");
        }

        }




