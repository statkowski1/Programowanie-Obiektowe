package pl.imiajd.tatkowski;

public class Main {

    public static void main(String[] args) {
        Punkt saver1 = new Punkt(4, 7);
        saver1.show();

        Adres saver2 = new Adres("Prosta", "31", "Warszawa", "30-210");
        Adres saver3 = new Adres("Krzywa", "49", "Olsztyn", "12-701");
        saver2.pokaz();
        saver3.pokaz();
        System.out.println(saver2.przed(saver3));

        Osoba saver4 = new Osoba("Kowalski", 1980);
        Student saver5 = new Student("Kurz", 2000, "Informatyka");
        Nauczyciel saver6 = new Nauczyciel("Górski", 1965, 7000);
        System.out.println(saver4.toString());
        System.out.println(saver5.toString());
        System.out.println(saver6.toString());

        BetterRectangle saver7 = new BetterRectangle(1, 1, 5, 10);
        System.out.println(saver7.getPerimeter());
        System.out.println(saver7.getArea());
    }
}
