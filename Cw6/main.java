package com.company;
import java.io.File;
import java.lang.Math;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        //zadanie 1
	    RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
        //zadanie 2
        IntegerSet tablica1 = new IntegerSet();
        IntegerSet tablica2 = new IntegerSet();
        tablica1.insertElement(20);
        tablica1.insertElement(30);
        tablica1.insertElement(40);
        tablica2.insertElement(46);
        tablica2.insertElement(30);
        tablica2.insertElement(20);
        System.out.println(tablica1);
        System.out.println(tablica2);
        System.out.println(IntegerSet.union(tablica1, tablica2));
        System.out.println(IntegerSet.intersection(tablica1, tablica2));
        tablica1.deleteElement(20);
        System.out.println(tablica1);
        System.out.println(tablica1.equals(tablica2));
        IntegerSet tablica3 = new IntegerSet();
        tablica3.insertElement(30);
        tablica3.insertElement(40);
        System.out.println(tablica1.equals(tablica3));
    }
}