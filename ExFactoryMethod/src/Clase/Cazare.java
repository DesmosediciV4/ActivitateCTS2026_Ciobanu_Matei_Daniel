package Clase;

public abstract class Cazare implements PachetTuristic {
    protected String descriere;
    protected String adresa;

    public Cazare(String descriere, String adresa) {
        this.descriere = descriere;
        this.adresa = adresa;
    }
}
