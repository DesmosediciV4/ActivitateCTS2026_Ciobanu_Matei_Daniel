package FactoryMethod.Fabrica;

import FactoryMethod.Clase.Ciorba;
import FactoryMethod.Clase.FelDeMancare;
import FactoryMethod.Clase.SupaCrema;

public class SupaFabrica implements FelDeMancareFabrica {

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, int gramaj, String denumire) {
        switch (tip){
            case TipSupa.SUPA_CREMA:
                return new SupaCrema(gramaj,denumire);

            case TipSupa.CIORBA:
                return new Ciorba(gramaj, denumire);

            default:
                return null; //Aici puteai sa mai arunci o exceptie in loc de default
        }
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, int gramaj, String denumire, int calorii) {
        return this.getFelDeMancare(tip,gramaj,denumire);
    }
}
