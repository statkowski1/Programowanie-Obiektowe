package com.company;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static String change(String str)
    {
        StringBuffer str2 = new StringBuffer();
        str2.append(str);
        for(int i=0; i<str2.length(); i++)
        {
            if(Character.isUpperCase(str2.charAt(i)))
            {
                str2.setCharAt(i, Character.toLowerCase(str2.charAt(i)));
            }
            else if(Character.isLowerCase(str2.charAt(i)))
            {
                str2.setCharAt(i, Character.toUpperCase(str2.charAt(i)));
            }
        }
    	return str2.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz str: ");
        String str = scan.nextLine();
        System.out.println(change(str));
    }
}