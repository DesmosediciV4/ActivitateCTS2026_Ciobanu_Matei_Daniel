package FactoryMethod.Clase;

public abstract class Supa implements FelDeMancare {
    protected int gramaj;
    protected String denumire;

    public Supa(int gramaj, String denumire) {
        this.gramaj = gramaj;
        this.denumire = denumire;
    }
}