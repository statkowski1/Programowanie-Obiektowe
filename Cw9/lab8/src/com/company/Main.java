package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>(5);
        grupa.add(new Osoba("Kowalski", LocalDate.of(1999, 4, 9)));
        grupa.add(new Osoba("Kowalski", LocalDate.of(1976, 11, 11)));
        grupa.add(new Osoba("Cieszynski", LocalDate.of(2000, 3, 21)));
        grupa.add(new Osoba("Iwaszkiewicz", LocalDate.of(2000, 3, 21)));
        grupa.add(new Osoba("Tatkowski", LocalDate.of(2000, 12, 3)));
        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);

        ArrayList<Student> grupa2 = new ArrayList<>(5);
        grupa2.add(new Student("Kowalski", LocalDate.of(1998, 4, 16), 4.2));
        grupa2.add(new Student("Iwaszkiewicz", LocalDate.of(1998, 4, 16), 4.2));
        grupa2.add(new Student("Cieszynski", LocalDate.of(1995, 7, 19), 4.4));
        grupa2.add(new Student("Cieszynski", LocalDate.of(1996, 4, 18), 4.6));
        grupa2.add(new Student("Tatkowski", LocalDate.of(2000, 12, 3), 4.4));
        System.out.println(grupa2);
        Collections.sort(grupa2);
        System.out.println(grupa2);


        ArrayList<String> text = new ArrayList<>();
        try {
            File file = new File("text.txt");
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
                text.add(read.nextLine());
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Brak pliku!");
            e.printStackTrace();
        }

        System.out.println(text);
        Collections.sort(text);
        System.out.println(text);
    }
}
