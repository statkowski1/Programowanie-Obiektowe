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

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(0, a);
        list.addAll(a.size(), b);
        int x;
        for(int i=0; i<list.size(); i++)
        {
            for(int j=1; j<list.size()-i; j++)
            {
                if(list.get(j-1)>list.get(j))
                {
                    x = list.get(j-1);
                    list.set(j-1, list.get(j));
                    list.set(j, x);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(4);
        list1.add(9);
        list1.add(16);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(9);
        list2.add(7);
        list2.add(4);
        list2.add(9);
        list2.add(11);
        System.out.println(mergeSorted(list1, list2));
    }
}