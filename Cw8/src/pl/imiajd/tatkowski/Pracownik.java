package pl.imiajd.tatkowski;
import java.time.LocalDate;

public class Pracownik extends Osoba{
    public Pracownik(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, double pobory, LocalDate dataZatrudnienia)
    {
        super(nazwisko,imiona,dataUrodzenia,plec);
        this.pobory = pobory;
        this.DataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return DataZatrudnienia;
    }

    public String getOpis()
    {
        return String.format("pracownik %s z pensją %.2f zł", this.DataZatrudnienia.toString(),this.pobory);
    }

    private double pobory;
    private LocalDate DataZatrudnienia;
}