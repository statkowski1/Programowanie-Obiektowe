package com.company;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static String nice(String str)
    {
        StringBuffer str2 = new StringBuffer();
        str2.append(str);
        int zmienna_pomocnicza = 0;
        for(int i=str.length()-1; i>0; i--)
        {
            zmienna_pomocnicza += 1;
            if(zmienna_pomocnicza%3==0)
            {
                str2.insert(i, "'");
            }
        }
        return str2.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz str: ");
        String str = scan.nextLine();
        System.out.println(nice(str));
    }
}