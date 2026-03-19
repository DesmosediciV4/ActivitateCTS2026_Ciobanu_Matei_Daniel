package FactoryMethod.Clase;

public abstract class Desert implements FelDeMancare {
    protected int gramaj;
    protected String denumire;
    protected int calorii;

    public Desert(int gramaj, String denumire, int calorii) {
        this.gramaj = gramaj;
        this.denumire = denumire;
        this.calorii = calorii;
    }
}