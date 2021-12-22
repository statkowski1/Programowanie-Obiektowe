package com.company;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{

    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public String toString()
    {
        return this.getClass().getSimpleName() + ": [" + this.getNazwisko() + "; " + this.getDataUrodzenia() + "; " + this.sredniaOcen + "]";
    }
}
