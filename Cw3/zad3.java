package com.company;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void mnozenieMacierzy(int tab1[][], int tab2[][], int tab3[][])
    {
        int x = 0;
        for(int i=0; i<tab1.length; i++)
        {
            for(int j=0; j<tab2[0].length; j++)
            {
                for(int k=0; k<tab2.length; k++)
                {
                    tab3[i][x] += tab1[j][k] * tab2[k][j];
                }
                x++;
            }
            x = 0;
        }
    }

    public static void generuj(int tab[][])
    {
        Random rand = new Random();
        for(int i=0; i<tab.length; i++)
        {
            for(int j=0; j<tab[i].length; j++)
            {
                tab[i][j] = rand.nextInt(10 - 1 + 1) + 1;
            }
        }
    }

    public static void wypiszMacierz(int tab[][])
    {
        for(int i=0; i<tab.length; i++)
        {
            for(int j=0; j<tab[i].length; j++)
            {
                System.out.print(tab[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę m: ");
        int m = scan.nextInt();
        System.out.println("Podaj liczbę n: ");
        int n = scan.nextInt();
        System.out.println("Podaj liczbę k: ");
        int k = scan.nextInt();
        int macierzA[][] = new int[m][n];
        int macierzB[][] = new int[n][k];
        int macierzC[][] = new int[m][k];
        generuj(macierzA);
        generuj(macierzB);
        wypiszMacierz(macierzA);
        System.out.println();
        wypiszMacierz(macierzB);
        mnozenieMacierzy(macierzA, macierzB, macierzC);
        System.out.println();
        wypiszMacierz(macierzC);
    }
}