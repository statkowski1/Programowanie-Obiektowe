package com.company;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static String repeat(String str, int n)
    {
        String wynik = str;
        for(int i=0; i<n-1; i++)
        {
            wynik += str;
        }
        return wynik;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz str: ");
        String str = scan.nextLine();
        System.out.println("Podaj ilość powtórzeń n: ");
        int n = scan.nextInt();
        System.out.println("Wynik: " + repeat(str, n));
    }
}