package com.company;

public class RachunekBankowy {
    public static double rocznaStopaProcentowa;
    private double saldo;

    public double obliczMiesieczneOdsetki()
    {
        double odsetki = (saldo * rocznaStopaProcentowa) / 12;
        saldo = saldo + odsetki;
        return saldo;
    }

    public static void setRocznaStopaProcentowa(double nowaRocznaStopaProcentowa)
    {
        rocznaStopaProcentowa = nowaRocznaStopaProcentowa;
    }

    public RachunekBankowy(double start)
    {
        saldo = start;
    }
}
