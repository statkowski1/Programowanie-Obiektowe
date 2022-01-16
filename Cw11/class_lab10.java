package com.company;

import java.util.*;

public class class_lab10 {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n)
    {
        for(int i=n-1; i<pracownicy.size(); i+=n-1)
        {
            pracownicy.remove(i);
        }
    }

    public static <T> void odwroc(LinkedList<T> lista)
    {
        LinkedList<T> x = new LinkedList<>(lista);
        for(int i=lista.size()-1, j=0; i>=0; i--, j++)
        {
            lista.set(j, x.get(i));
        }
    }

    public static String odwroc_zdania(String zdania)
    {
        String[] s1 = zdania.split(" ");
        Stack<String> kontener = new Stack<>();
        StringBuilder odwrocone_zdania = new StringBuilder();
        for(String s2: s1)
        {
            kontener.push(s2);
            if(s2.endsWith("."))
            {
                while(!kontener.empty())
                {
                    StringBuilder odwrocone_zdania_tmp = new StringBuilder();
                    odwrocone_zdania_tmp.append(kontener.pop());
                    if(kontener.empty())
                    {
                        odwrocone_zdania_tmp.setCharAt(0, Character.toLowerCase(odwrocone_zdania_tmp.charAt(0)));
                        odwrocone_zdania.append(odwrocone_zdania_tmp);
                        odwrocone_zdania.append(". ");
                    }
                    else if(odwrocone_zdania_tmp.toString().equals(s2))
                    {
                        odwrocone_zdania_tmp.setCharAt(0, Character.toUpperCase(odwrocone_zdania_tmp.charAt(0)));
                        odwrocone_zdania.append(odwrocone_zdania_tmp, 0, odwrocone_zdania_tmp.length()-1);
                        odwrocone_zdania.append(" ");
                    }
                    else
                    {
                        odwrocone_zdania.append(odwrocone_zdania_tmp);
                        odwrocone_zdania.append(" ");
                    }
                }
            }
        }
        return odwrocone_zdania.toString();
    }

    public static String cyfry(int liczba)
    {
        Stack<Integer> zbior_cyfr = new Stack<>();
        StringBuilder wynik = new StringBuilder();
        while(liczba!=0)
        {
            zbior_cyfr.push(liczba%10);
            liczba /= 10;
        }
        while(!zbior_cyfr.empty())
        {
            wynik.append(zbior_cyfr.pop().toString());
            wynik.append(" ");
        }
        return wynik.toString();
    }

    public static ArrayList<Integer> sitoEratostenesa(int n)
    {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> wynik = new ArrayList<>();
        for(int i=2; i<=n; i++)
        {
            lista.add(i);
        }
        for(int i=0; i<=lista.size()-1; i++)
        {
            for(int j=0; j<=n-2; j++)
            {
                if(lista.get(j)%lista.get(i)==0 & lista.get(j)!=lista.get(i) & lista.get(i)!=-1)
                {
                    lista.set(j, -1);
                }
            }
        }
        for(int i=0; i<=lista.size()-1; i++)
        {
            if(lista.get(i)!=-1)
            {
                wynik.add(lista.get(i));
            }
        }
        return wynik;
    }

    public static <T extends Iterable<?>> void print(T objekt)
    {
        Iterator<?> list = objekt.iterator();
        while(list.hasNext())
        {
            System.out.print(list.next());
            System.out.print(", ");
        }
    }
}
