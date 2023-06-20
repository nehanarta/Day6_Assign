package com.bridglabz;

public class Sqrt {
    static int t;
    static float T;
    static float epsilon;
    static void sqrt(int c){
           t=c;
            T = (float) (Math.abs(t - c / t));
            epsilon = (float) ((1 * 2.718281828459045 - 15) * t);
            while (T > epsilon) {
                T = Math.abs(t - c / t);
                epsilon = (float) ((1 * 2.718281828459045 - 15) * t);
                break;
            }
            System.out.println(T);
        }

    public static void main(String[] args) {
        sqrt(5);
    }
    }


