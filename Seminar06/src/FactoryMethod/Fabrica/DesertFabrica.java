package FactoryMethod.Fabrica;

import FactoryMethod.Clase.Clatite;
import FactoryMethod.Clase.FelDeMancare;
import FactoryMethod.Clase.Papanas;

public class DesertFabrica implements FelDeMancareFabrica{
    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, int gramaj, String denumire) {
        return this.getFelDeMancare(tip,gramaj,denumire,500);
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, int gramaj, String denumire, int calorii) {
        switch (tip){
            case TipDesert.PAPANASI:
                return new Papanas(gramaj,denumire,calorii);

            case TipDesert.CLATITE:
                return new Clatite(gramaj, denumire, calorii);

            default:
                return null; //Aici puteai sa mai arunci o exceptie in loc de default
        }
    }
}
