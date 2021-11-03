package com.company;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int countChar(String str, char c)
    {
        int wynik = 0;
        int dlugosc = str.length();
        for(int i=0; i<dlugosc; i++)
        {
            if(str.charAt(i)==c)
            {
                wynik += 1;
            }
        }
        return wynik;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz str: ");
        String str = scan.nextLine();
        System.out.println("Podaj litere c: ");
        char c = scan.next().charAt(0);
        System.out.println("Ilość wystąpień litery w wyrazie: " + countChar(str, c));
    }
}