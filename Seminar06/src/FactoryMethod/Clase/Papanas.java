package FactoryMethod.Clase;

public class Papanas extends Desert{

    public Papanas(int gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }


    @Override
    public void afiseazaPret() {
        System.out.println("Papanasii cu "+super.denumire+" au "+super.gramaj+" grame si "+super.calorii+" calorii");
    }
}
