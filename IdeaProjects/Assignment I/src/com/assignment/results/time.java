package com.assignment.results;

import java.util.Scanner;

public class time {
    public static void main(String[]args){
        int seconds = 0,resultsMinutes, resultsYears, resultsSeconds, resultsDays;
        Scanner read;
        read=new Scanner(System.in);

        while (true){
            System.out.print("Enter time in seconds:");
            seconds= read.nextInt();
            resultsYears=seconds/31536000;
            resultsMinutes=seconds/60;
            resultsDays=seconds/86400;
            resultsSeconds=seconds;
            if (seconds>0&&seconds<=60)
                System.out.println("The time in years is"+resultsYears+"The time in days is"+resultsDays+"The time in Minutes is"
                +resultsMinutes+"The time in seconds is"+resultsSeconds);
            else
                System.out.println("Enter a valid time?");

        }
    }
}
