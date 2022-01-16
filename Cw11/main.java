package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> pracownicy = new LinkedList<>();
        pracownicy.add("Mateusz");
        pracownicy.add("Anna");
        pracownicy.add("Marzena");
        pracownicy.add("Tomasz");
        pracownicy.add("Dominika");
        pracownicy.add("Filip");
        pracownicy.add("Adrian");
        System.out.println(pracownicy);
        class_lab10.redukuj(pracownicy, 3);
        System.out.println(pracownicy);

        LinkedList<Integer> numery = new LinkedList<>();
        numery.add(1);
        numery.add(2);
        numery.add(3);
        numery.add(4);
        numery.add(5);
        numery.add(6);
        numery.add(7);
        numery.add(8);
        numery.add(9);
        numery.add(10);
        System.out.println(numery);
        class_lab10.odwroc(numery);
        System.out.println(numery);

        System.out.println(class_lab10.odwroc_zdania("Ala ma kota. Jej kot lubi myszy."));

        System.out.println(class_lab10.cyfry(2015));

        System.out.println(class_lab10.sitoEratostenesa(60));

        class_lab10.print(pracownicy);
        System.out.println();
        class_lab10.print(class_lab10.sitoEratostenesa(60));
    }
}
