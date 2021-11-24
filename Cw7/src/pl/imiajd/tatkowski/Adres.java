package pl.imiajd.tatkowski;

public class Adres {
    private String ulica;
    private String numer_domu;
    private String numer_mieszkania = "";
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, String numer_domu, String numer_mieszkania, String miasto, String kod_pocztowy)
    {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, String numer_domu, String miasto, String kod_pocztowy)
    {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz()
    {
        System.out.println(this.kod_pocztowy + " " + this.miasto);
        System.out.println(this.ulica + " " + this.numer_domu + " " + this.numer_mieszkania);
    }

    public boolean przed(Adres w)
    {
        int kod_pocztowy1 = Integer.parseInt(this.kod_pocztowy.substring(1, 2) + this.kod_pocztowy.substring(4, 6));
        int kod_pocztowy2 = Integer.parseInt(w.kod_pocztowy.substring(1, 2) + w.kod_pocztowy.substring(4, 6));
        return kod_pocztowy1 < kod_pocztowy2;
    }
}
