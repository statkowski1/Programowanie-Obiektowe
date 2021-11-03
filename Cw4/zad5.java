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
import java.util.Scanner;

public class Main {

    public static BigDecimal IloscKapitalu(int n, double k, double p)
    {
        BigDecimal wynik = BigDecimal.valueOf(k);
        BigDecimal p_converted = BigDecimal.valueOf(p);
        for(int i=0; i<n; i++)
        {
            wynik = wynik.add(wynik.multiply(p_converted));
        }
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println("Końcowa stawka na koncie: " + IloscKapitalu(7, 10000, 0.1));
    }
}