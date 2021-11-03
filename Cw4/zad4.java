package com.company;
import java.io.File;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.io.FileNotFoundException;
import java.math.BigInteger;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static BigInteger Mak(int n)
    {
        BigInteger pod_wynik1 = BigInteger.TWO.pow(n*n);
        BigInteger pod_wynik2 = BigInteger.ONE;
        BigInteger wynik = pod_wynik1.subtract(pod_wynik2);
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println("Wynik: " + Mak(2));
    }
}