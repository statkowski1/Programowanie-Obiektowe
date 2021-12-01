package pl.imiajd.tatkowski;

import java.time.LocalDate;

public abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji)
    {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public abstract String dzwiek();

    public String getProducent() {
        return this.producent;
    }

    public LocalDate getRokProdukcji() {
        return this.rokProdukcji;
    }

    public boolean equals()
    {
        if(producent.equals(producent) && rokProdukcji.equals(rokProdukcji))
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return "Instrument: " + this.getClass().getSimpleName() + ", producent: " + this.producent + ", rok produkcji: " + rokProdukcji;
    }
}
