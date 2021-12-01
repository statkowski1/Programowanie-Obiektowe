package pl.imiajd.tatkowski;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", new String[]{"Jan"}, LocalDate.of(1999, 7, 19), false, 50000, LocalDate.of(2020, 7, 1));
        ludzie[1] = new Student("Nowak", new String[]{"Małgorzata", "Maria", "Monika"}, LocalDate.of(1995, 9, 10), true,"informatyka", 4.4);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }

        System.out.println();

        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Flet("HALP", LocalDate.of(1980, 6, 5)));
        orkiestra.add(new Flet("TRAL", LocalDate.of(1800, 9, 1)));
        orkiestra.add(new Fortepian("MAKI", LocalDate.of(2000, 7, 3)));
        orkiestra.add(new Fortepian("PAL", LocalDate.of(1500, 6, 11)));
        orkiestra.add(new Skrzypce("IKI0", LocalDate.of(1950, 4, 4)));

        for(Instrument x: orkiestra)
        {
            System.out.println(x.dzwiek());
            System.out.println(x);
        }

        System.out.println(orkiestra.get(0).equals(orkiestra.get(0)));
        System.out.println(orkiestra.get(0).equals(orkiestra.get(1)));
    }
}