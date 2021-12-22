package com.company;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba>{

    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia)
    {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko()
    {
        return this.nazwisko;
    }

    public LocalDate getDataUrodzenia()
    {
        return this.dataUrodzenia;
    }

    public String toString()
    {
        return this.getClass().getSimpleName() + ": [" + this.nazwisko + "; " + this.dataUrodzenia + "]";
    }

    public boolean equals(Object obj)
    {
        Osoba o = (Osoba) obj;
        return (o.nazwisko.equals(this.nazwisko)) && (o.dataUrodzenia.equals(this.dataUrodzenia));
    }

    @Override
    public int compareTo(Osoba o) {
        if(this.nazwisko.compareTo(o.nazwisko)==0)
        {
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return this.nazwisko.compareTo(o.nazwisko);
    }
}
