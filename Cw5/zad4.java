package com.company;
import java.io.File;
import java.lang.Math;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;

import java.io.*;
import java.util.Scanner;

public class Main {
    
    public static ArrayList<Integer> reversed(ArrayList<Integer> a)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=a.size()-1; i>-1; i--)
        {
            list.add(a.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        System.out.println(reversed(list1));
    }
}