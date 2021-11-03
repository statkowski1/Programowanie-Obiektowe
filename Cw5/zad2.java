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

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = 0;
        if(a.size()>b.size())
        {
            for(int i=0; i<b.size(); i++)
            {
                list.add(a.get(i));
                list.add(b.get(i));
                index++;
            }
            for(int i=0; i<a.size()- b.size(); i++)
            {
                list.add(a.get(i+index));
            }
        }
        else
        {
            for(int i=0; i<a.size(); i++)
            {
                list.add(a.get(i));
                list.add(b.get(i));
                index++;
            }
            for(int i=0; i<b.size()- a.size(); i++)
            {
                list.add(b.get(i+index));
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
        System.out.println(merge(list1, list2));
    }
}