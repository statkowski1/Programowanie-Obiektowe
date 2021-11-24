package com.company;
import java.util.ArrayList;

public class IntegerSet {
    private final boolean[] tablica;

    public IntegerSet() {
        tablica = new boolean[100];
    }

    public static IntegerSet union(IntegerSet a, IntegerSet b)
    {
        IntegerSet tablica_x = new IntegerSet();
        for(int i=0; i<100; i++)
        {
            if(a.tablica[i] || b.tablica[i])
            {
                tablica_x.tablica[i] = true;
            }
        }
        return tablica_x;
    }

    public static IntegerSet intersection(IntegerSet a, IntegerSet b)
    {
        IntegerSet tablica_x = new IntegerSet();
        for(int i=0; i<100; i++)
        {
            if(a.tablica[i] && b.tablica[i])
            {
                tablica_x.tablica[i] = true;
            }
        }
        return tablica_x;
    }

    public void insertElement(int x)
    {
        tablica[x-1] = true;
    }

    public void deleteElement(int x)
    {
        tablica[x-1] = false;
    }

    public String toString()
    {
        StringBuilder napis = new StringBuilder();
        for(int i=0; i<100; i++)
        {
            if(tablica[i])
            {
                napis.append(i+1);
                napis.append(" ");
            }
        }
        return napis.toString();
    }

    public boolean equals(IntegerSet y)
    {
        return this.toString().equals(y.toString());
    }
}