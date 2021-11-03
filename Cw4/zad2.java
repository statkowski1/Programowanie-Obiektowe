package com.company;
import java.io.File;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.io.FileNotFoundException;

public class Main {

    public static int IloscWystapienTxt(String str, char str2)
    {
        int wynik = 0;
        try
        {
            File plik = new File(str);
            Scanner scan_pliku = new Scanner(plik);
            while(scan_pliku.hasNextLine())
            {
                String str3 = scan_pliku.nextLine();
                int index = 0;
                while(index<str3.length())
                {
                    if(str3.charAt(index)==str2)
                    {
                        wynik += 1;
                    }
                    index += 1;
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
        char str2 = scan.next().charAt(0);
        System.out.println("Ten znak powtarza się: " + IloscWystapienTxt(str, str2));
    }
}