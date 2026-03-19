package FactoryMethod.Clase;

public class SupaCrema extends Supa {


    public SupaCrema(int gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseazaPret() {
        System.out.println("Supa crema "+super.denumire+" are "+super.gramaj+" de grame");
    }
}
