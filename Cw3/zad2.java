package com.company;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc)
    {
        Random rand = new Random();
        for(int i=0; i<n; i++)
        {
            tab[i] = rand.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }
    }

    public static int ileNieparzystych(int tab[])
    {
        int wynik = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]%2==1 || tab[i]%2==-1)
            {
                wynik += 1;
            }
        }
        return wynik;
    }

    public static int ileParzystych(int tab[])
    {
        int wynik = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]%2==0)
            {
                wynik += 1;
            }
        }
        return wynik;
    }

    public static int ileDodatnich(int tab[])
    {
        int wynik = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]>0)
            {
                wynik += 1;
            }
        }
        return wynik;
    }

    public static int ileUjemnych(int tab[])
    {
        int wynik = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]<0)
            {
                wynik += 1;
            }
        }
        return wynik;
    }

    public static int ileZerowych(int tab[])
    {
        int wynik = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]==0)
            {
                wynik += 1;
            }
        }
        return wynik;
    }

    public static int ileMaksymalnych(int tab[])
    {
        int max = tab[0];
        int wynik = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(max<tab[i])
            {
                max = tab[i];
            }
        }
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]==max)
            {
                wynik += 1;
            }
        }
        return wynik;
    }

    public static int sumaDodatnich(int tab[])
    {
        int wynik = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]>0)
            {
                wynik += tab[i];
            }
        }
        return wynik;
    }

    public static int sumaUjemnych(int tab[])
    {
        int wynik = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]<0)
            {
                wynik += tab[i];
            }
        }
        return wynik;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[])
    {
        int pod_wynik = 0;
        int wynik = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]>0)
            {
                pod_wynik += 1;
            }
            else
            {
                if(pod_wynik>wynik)
                {
                    wynik = pod_wynik;
                }
                pod_wynik = 0;
            }
        }
        return wynik;
    }

    public static void signum(int tab[])
    {
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]>0)
            {
                tab[i] = 1;
            }
            if(tab[i]<0)
            {
                tab[i] = -1;
            }
        }
    }

    public static void wypisz(int tab[])
    {
        for(int i=0; i<tab.length; ++i)
        {
            System.out.print(tab[i] + ", ");
        }
    }

    public static void odwrocFragment(int tab[],int lewy, int prawy)
    {
        int x;
        int j = prawy;
        for(int i=lewy-1; i<prawy; i++)
        {
            x = tab[i];
            tab[i] = tab[j];
            tab[j] = x;
            j--;
            if(i==j)
            {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        int n = scan.nextInt();
        int tablica[] = new int[n];
        generuj(tablica, n, -999, 999);
        wypisz(tablica);
        System.out.println();
        System.out.println("Ilość liczb nieparzystych: " + ileNieparzystych(tablica));
        System.out.println("Ilość liczb parzystych:" + ileParzystych(tablica));
        System.out.println("Ilość liczb dodatnich: " + ileDodatnich(tablica));
        System.out.println("Ilośc liczb ujemnych: " + ileUjemnych(tablica));
        System.out.println("Ilość zer: " + ileZerowych(tablica));
        System.out.println("Ilość liczb maksymalnych: " + ileMaksymalnych(tablica));
        System.out.println("Suma liczb dodatnich: " + sumaDodatnich(tablica));
        System.out.println("Suma liczb ujemnych: " + sumaUjemnych(tablica));
        System.out.println("Długość maksymalnego ciągu liczb dodatnich: " + dlugoscMaksymalnegoCiaguDodatnich(tablica));
        int tablica2[] = new int[n];
        for(int i=0; i<tablica.length; i++)
        {
            tablica2[i] = tablica[i];
        }
        signum(tablica2);
        System.out.print("Signum: ");
        wypisz(tablica2);
        System.out.println();
        System.out.print("Odwrócony fragment tablicy: ");
        odwrocFragment(tablica, 2, 6);
        wypisz(tablica);
    }
}