package FactoryMethod.Fabrica;

import FactoryMethod.Clase.FelDeMancare;

public interface FelDeMancareFabrica {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, int gramaj, String denumire);
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, int gramaj, String denumire, int calorii);
}
