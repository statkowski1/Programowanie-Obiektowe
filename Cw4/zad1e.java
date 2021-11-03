package com.company;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int countSubStr(String str, String subStr)
    {
        int wynik = 0;
        int pod_wynik = 0;
        int dlugosc1 = str.length();
        int dlugosc2 = subStr.length();
        for(int i=0; i<dlugosc1-dlugosc2+1; i++)
        {
            for(int j=0; j<dlugosc2; j++)
            {
                if(str.charAt(i+j)==subStr.charAt(j))
                {
                    pod_wynik += 1;
                }
                if(pod_wynik==dlugosc2)
                {
                    wynik += 1;
                }
            }
            pod_wynik = 0;
        }
        return wynik;
    }

    public static int[] where(String str, String subStr)
    {

        int[] anArray = new int[countSubStr(str, subStr)];
        int index = 0;
        int pod_wynik = 0;
        int dlugosc1 = str.length();
        int dlugosc2 = subStr.length();
        for(int i=0; i<dlugosc1-dlugosc2+1; i++)
        {
            for(int j=0; j<dlugosc2; j++)
            {
                if(str.charAt(i+j)==subStr.charAt(j))
                {
                    pod_wynik += 1;
                }
                if(pod_wynik==dlugosc2)
                {
                    anArray[index] = i;
                    index += 1;
                }
            }
            pod_wynik = 0;
        }
        return anArray;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz str: ");
        String str = scan.nextLine();
        System.out.println("Podaj wyraz subStr: ");
        String subStr = scan.nextLine();
        for(int i=0; i<where(str, subStr).length; i++)
        {
            System.out.print(where(str, subStr)[i] + ", ");
        }
    }
}