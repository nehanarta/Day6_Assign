package com.bridglabz;
import java.util.Scanner;


public class StopWatch {
    static long startWatchValue = 0;
    static long stopWatchValue = 0;

    static long startWatch() {
        startWatchValue = System.currentTimeMillis();
        return startWatchValue;

    }

    static long stopWatch() {
        stopWatchValue = System.currentTimeMillis();
        return stopWatchValue;
    }
    static void calculateDiffernce(long x,long y){
        long result=(y-x);
        System.out.println("time Difference :====>"+result);
        System.out.println("converting ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int count = 0;
        long startTime = 0;
        long stopTime = 0;
        while (temp != 0) {
            System.out.println("1.start,2.stop,3.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    count = 1;
                    startTime = startWatch();
                    System.out.println("startTime is====>" + startTime);
                    break;
                case 2:
                    if (count == 1) {
                        stopTime = stopWatch();
                        System.out.println("stopTime is====>" + stopTime);
                        calculateDiffernce(startTime,stopTime);
                    } else {
                        System.out.println("first start the watch");
                    }
                    break;
                case 3:
                    temp = -1;
                    break;
                default:
                    break;
            }
        }
    }
}






