package FactoryMethod.Clase;

public class Ciorba extends Supa{


    public Ciorba(int gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseazaPret() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ciorba ");
        sb.append(super.denumire);
        sb.append(" are ");
        sb.append(super.gramaj);
        sb.append(" de grame.");
        sb.toString();
    }
}
