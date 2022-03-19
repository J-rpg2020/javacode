package com.assignment.results;

import java.util.Scanner;

public class Results {
    public static void main(String[] args) {
        String name, unit;
        int cat = 0,exam,results;

        Scanner read;
        read=new Scanner(System.in);
        System.out.print("Enter your name:");
        name=read.nextLine();
        Scanner scan;
        read=new Scanner(System.in);
        System.out.print("Enter The Unit:");
        unit=read.nextLine();

        Scanner search;
        scan=new Scanner(System.in);
        while(true){
            System.out.println("Enter your Cat marks:");
            cat=scan.nextInt();
            if(cat<=30&&cat>0)
                break;

            else
                System.out.println("The cat marks should be between 0 and 30");

        }

        Scanner identify;
        scan=new Scanner(System.in);
        while(true){
            System.out.println("Enter your Exam marks:");
            exam=scan.nextInt();
            if(exam<=70&&exam>0)
                break;

            else
                System.out.println("The exam marks should be between 0 and 70");

        }

        results=cat+exam;
        if(results>=70)
            System.out.println(name+" attained a Grade A "+" in  " + unit);
        else if (results>=60)
            System.out.println(name+" attained a Grade B");
        else if (results>=50)
            System.out.println(name+ " attained a Grade C");
        else if (results>=40)
            System.out.println(name+" attained a Grade D");
        else
            System.out.println(name+" attained a Grade F");
    }
}
