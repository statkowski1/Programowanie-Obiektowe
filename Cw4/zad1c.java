package com.company;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static String middle(String str)
    {
        int dlugosc = str.length();
        if(dlugosc%2==1)
        {
            return str.substring(dlugosc/2, dlugosc/2+1);
        }
        else
        {
            return str.substring(dlugosc/2-1, dlugosc/2+1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz str: ");
        String str = scan.nextLine();
        System.out.println("Srodkowy znak: " + middle(str));
    }
}s