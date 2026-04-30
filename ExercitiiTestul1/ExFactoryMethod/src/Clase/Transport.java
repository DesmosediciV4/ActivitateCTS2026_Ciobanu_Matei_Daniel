package Clase;

public abstract class Transport implements PachetTuristic{
    protected String descriere;
    protected int cost;

    public Transport(String descriere, int cost) {
        this.descriere = descriere;
        this.cost = cost;
    }
}
