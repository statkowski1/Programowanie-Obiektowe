package com.company;
import java.io.File;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.io.FileNotFoundException;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static int IloscWystapienTxt2(String str, String str2)
    {
        int wynik = 0;
        try
        {
            File plik = new File(str);
            Scanner scan_pliku = new Scanner(plik);
            while(scan_pliku.hasNext())
            {
                String tmp = scan_pliku.next();
                if(tmp.equals(str2))
                {
                    wynik += 1;
                }
            }
            scan_pliku.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return wynik;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz ścieżkę do pliku: ");
        String str = scan.nextLine();
        System.out.println("Podaj szukany znak: ");
        String str2 = scan.nextLine();
        System.out.println("Ten wyraz powtarza się: " + IloscWystapienTxt2(str, str2));
    }
}