package pl.imiajd.tatkowski;

public class Student extends Osoba{
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek)
    {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String getKierunek()
    {
        return this.kierunek;
    }

    public String toString()
    {
        return super.toString() + ", Kierunek: " + this.kierunek;
    }
}
