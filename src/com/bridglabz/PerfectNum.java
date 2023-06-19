package com.bridglabz;
import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        long N=sc.nextLong();
        long sum=0;
        for(int i=1;i<=N/2;i++){
            if(N%i==0){
                sum+=i;
            }
        }
        if(sum==N){
            System.out.println(N+"====>is perfect Number");
        }else{
            System.out.println(N+"=====>is not perfect Number");
        }


    }
}
