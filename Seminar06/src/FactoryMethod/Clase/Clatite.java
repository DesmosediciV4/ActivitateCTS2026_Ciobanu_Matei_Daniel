package FactoryMethod.Clase;

public class Clatite extends Desert{

    public Clatite(int gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseazaPret() {
        System.out.println("Clatitele cu "+super.denumire+" au "+super.gramaj+" grame si "+super.calorii+" calorii");
    }
}
