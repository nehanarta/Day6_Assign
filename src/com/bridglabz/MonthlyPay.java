package com.bridglabz;
import java.util.Scanner;
public class MonthlyPay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle loan amount");
        float P=sc.nextFloat();
        System.out.println("Enter R per cent Interest");
        float R=sc.nextFloat();
        System.out.println("Enter the year");
        int Y=sc.nextInt();
        double n = 12 * Y;
        double r = ((R * 100) / 12);
        double q = (1 + r);
        double m = Math.pow(q, -n);
        double payment = ((P * r) / (1 - m));
        System.out.println(payment);

    }
}
