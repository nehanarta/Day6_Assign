package com.bridglabz;
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int Num=sc.nextInt();
        int reminder;
        int reverse=0;
        for(int i=1;i<Num;i++){
            reminder=Num%10;
            reverse=reverse*10+reminder;
            Num=Num/10;

        }
        System.out.println("Reverse Number====>"+reverse);

    }
}
