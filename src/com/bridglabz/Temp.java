package com.bridglabz;
import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  C");
        float C = sc.nextFloat();
        float F;
        F = ((C * 9 / 5) + 32);
        System.out.println("The temperature in Fahrenheit: " + F);
        C = ((F - 32) * 5 / 9);
        System.out.println("The temperature in Celsius " + C);

    }
}
